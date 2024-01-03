package git.dragomordor.cobblemizer.forge.item.custom;

import com.cobblemon.mod.common.api.pokemon.stats.Stat;
import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.cobblemon.mod.common.pokemon.EVs;
import com.cobblemon.mod.common.pokemon.Pokemon;
import git.dragomordor.cobblemizer.forge.config.CobblemizerConfig;
import git.dragomordor.cobblemizer.forge.misc.TierRarityClass;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class EVAddItem extends PokemonUseItem {
    private final String tier;
    private final Stat statToBoost;

    public EVAddItem(String tier, Stat statToBoost) {
        super(new Properties().stacksTo(1));
        this.tier = tier;
        this.statToBoost = statToBoost;
    }

    @Override
    public InteractionResult processInteraction(ItemStack itemStack, Player player, PokemonEntity target, Pokemon pokemon) {
        CobblemizerConfig config = CobblemizerConfig.Builder.load();
        int maxEV = EVs.MAX_STAT_VALUE; // Maximum EV value
        EVs evs = pokemon.getEvs(); // Current EV values
        // Get the increaseAmount from the config based on the provided tier
        int increaseAmount = getIncreaseAmountForTier(config, tier);
        int EVcurrentAmount = evs.get(this.statToBoost);
        // Modify the Pokémon's EV by the obtained increaseAmount
        int newEVAmount = Math.min(EVcurrentAmount + increaseAmount, maxEV);
        int actualIncrease = newEVAmount - EVcurrentAmount;

        if (actualIncrease <= 0) { // If EV is already at max, return fail
            player.sendSystemMessage(Component.translatable((statToBoost.getDisplayName().getString() + " EV is already at maximum")));
            return InteractionResult.FAIL;
        }

        // if EV not max, increase by tier amount
        evs.add(statToBoost, actualIncrease);
        player.sendSystemMessage(Component.translatable("Increased Pokémon's " + statToBoost.getDisplayName().getString() + " EV by " + actualIncrease));
        if (newEVAmount == maxEV) { // if new EV amount is maxed, indicate to player
            player.sendSystemMessage(Component.translatable("Pokémon's " + statToBoost.getDisplayName().getString() + " EV is now at maximum"));
        }
        itemStack.setCount(itemStack.getCount() - 1); // remove item after use
        return InteractionResult.SUCCESS;
    }
    // Method to get the increaseAmount from the config based on the provided tier
    private int getIncreaseAmountForTier(CobblemizerConfig config, String tierName) {
        for (TierRarityClass tier : config.EVTiers) {
            if (tier.name.equalsIgnoreCase(tierName)) {
                return tier.increaseAmount;
            }
        }
        return 0; // Default value if tierName not found in config
    }
}
