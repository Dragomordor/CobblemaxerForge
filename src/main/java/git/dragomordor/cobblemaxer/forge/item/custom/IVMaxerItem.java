package git.dragomordor.cobblemaxer.forge.item.custom;

import com.cobblemon.mod.common.api.pokemon.stats.Stat;
import com.cobblemon.mod.common.api.pokemon.stats.Stats;
import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.cobblemon.mod.common.pokemon.IVs;
import com.cobblemon.mod.common.pokemon.Pokemon;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class IVMaxerItem extends PokemonUseItem {
    private final Stat statToBoost;

    public IVMaxerItem(Stat statToBoost) {
        super(new Properties().stacksTo(1));
        this.statToBoost = statToBoost;
    }

    @Override
    public InteractionResult processInteraction(ItemStack itemStack, Player player, PokemonEntity target, Pokemon pokemon) {

        IVs ivs = pokemon.getIvs(); // Access the IVs of the Pokémon

        // Check if the input stat is null to max out all stats
        if (this.statToBoost == null) {
            for (Stat stat : Stats.values()) {
                ivs.set(stat, IVs.MAX_VALUE);
            }
            itemStack.setCount(itemStack.getCount() - 1); // remove item after use
            player.sendSystemMessage(Component.translatable("All IVs boosted to maximum!"));
            return InteractionResult.SUCCESS;
        }

        // When input is a given stat, max that stat
        ivs.set(this.statToBoost, IVs.MAX_VALUE); // set IV to maximum
        itemStack.setCount(itemStack.getCount() - 1); // remove item after use
        String statDisplayName = this.statToBoost.getDisplayName().getString();
        player.sendSystemMessage(Component.translatable(statDisplayName + " IV boosted to maximum!"));
        return InteractionResult.SUCCESS;
    }
}