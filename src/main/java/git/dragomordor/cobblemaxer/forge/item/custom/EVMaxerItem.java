package git.dragomordor.cobblemaxer.forge.item.custom;

import com.cobblemon.mod.common.api.pokemon.stats.Stat;
import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.cobblemon.mod.common.pokemon.EVs;
import com.cobblemon.mod.common.pokemon.Pokemon;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

public class EVMaxerItem extends PokemonUseItem{
    private final Stat statToBoost;

    public EVMaxerItem(Stat statToBoost) {
        super(new Properties().stacksTo(1));
        this.statToBoost = statToBoost;
    }

    @Override
    public InteractionResult processInteraction(ItemStack itemStack, Player player, PokemonEntity target, Pokemon pokemon) {
        EVs evs = pokemon.getEvs(); // Access the EVs of the Pokémon
        // TODO: add error message if stat is already maxe
        // TODO: add maximum available, not a maximum value

        // When input is a given stat, max that stat
        evs.add(this.statToBoost, EVs.MAX_STAT_VALUE); // Increase the specified EV stat to its maximum value
        itemStack.setCount(itemStack.getCount() - 1); // remove item after use
        String statDisplayName = this.statToBoost.getDisplayName().getString();
        player.sendSystemMessage(Component.translatable(statDisplayName + " EV boosted to maximum!"));
        return InteractionResult.SUCCESS;
    }
}
