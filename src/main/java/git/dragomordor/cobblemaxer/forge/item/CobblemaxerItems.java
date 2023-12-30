package git.dragomordor.cobblemaxer.forge.item;

import com.cobblemon.mod.common.Cobblemon;
import com.cobblemon.mod.common.api.pokemon.stats.Stat;
import com.cobblemon.mod.common.api.pokemon.stats.Stats;
import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.cobblemon.mod.common.pokemon.Pokemon;
import git.dragomordor.cobblemaxer.forge.CobblemaxerMod;
import git.dragomordor.cobblemaxer.forge.item.custom.*;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CobblemaxerItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CobblemaxerMod.MODID);

    // all item registries
    // register default item type

    // register PokemonUseItems

    // register IVMaxerItems
    public static final RegistryObject<Item> SPDEF_IV_MAXER = registerIVMaxerItem("spdef_iv_maxer", Stats.SPECIAL_DEFENCE);
    public static final RegistryObject<Item> SPATK_IV_MAXER = registerIVMaxerItem("spatk_iv_maxer", Stats.SPECIAL_ATTACK);
    public static final RegistryObject<Item> SPD_IV_MAXER = registerIVMaxerItem("spd_iv_maxer", Stats.SPEED);
    public static final RegistryObject<Item> DEF_IV_MAXER = registerIVMaxerItem("def_iv_maxer", Stats.DEFENCE);
    public static final RegistryObject<Item> ATK_IV_MAXER = registerIVMaxerItem("atk_iv_maxer", Stats.ATTACK);
    public static final RegistryObject<Item> HP_IV_MAXER = registerIVMaxerItem("hp_iv_maxer", Stats.HP);
    public static final RegistryObject<Item> ALL_IV_MAXER = registerIVMaxerItem("all_iv_maxer", null);
    // register IVRandomItem
    public static final RegistryObject<Item> IV_RANDOM = registerIVRandomItem("iv_random");
    // register EVMaxerItems
    public static final RegistryObject<Item> SPDEF_EV_MAXER = registerEVMaxerItem("spdef_ev_maxer", Stats.SPECIAL_DEFENCE);
    public static final RegistryObject<Item> SPATK_EV_MAXER = registerEVMaxerItem("spatk_ev_maxer", Stats.SPECIAL_ATTACK);
    public static final RegistryObject<Item> SPD_EV_MAXER = registerEVMaxerItem("spd_ev_maxer", Stats.SPEED);
    public static final RegistryObject<Item> DEF_EV_MAXER = registerEVMaxerItem("def_ev_maxer", Stats.DEFENCE);
    public static final RegistryObject<Item> ATK_EV_MAXER = registerEVMaxerItem("atk_ev_maxer", Stats.ATTACK);
    public static final RegistryObject<Item> HP_EV_MAXER = registerEVMaxerItem("hp_ev_maxer", Stats.HP);
    // register EVRandomItem
    public static final RegistryObject<Item> EV_RANDOM = registerEVRandomItem("ev_random");
    //register LVLMaxerItem
    public static final RegistryObject<Item> LVL_MAXER = registerLVLMaxerItem("level_maxer");
    //register LVLRandomItem
    public static final RegistryObject<Item> LVL_RANDOM = registerLVLRandomItem("level_random");




    // event bus
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    // Helper methods to simplify item registration
    //Register vanilla minecraft item type
    private static RegistryObject<Item> registerItem(String name) {
        return ITEMS.register(name, () -> new Item(new Item.Properties()));
    }
    //Register PokemonUse item type
    private static RegistryObject<Item> registerPokemonUseItem(String name) {
        return ITEMS.register(name, () -> new PokemonUseItem(new Item.Properties()) {
            @Override
            public InteractionResult processInteraction(ItemStack itemStack, Player player, PokemonEntity target, Pokemon pokemon) {
                return null;
            }
        });
    }
    //Register IVMaxer item type
    private static RegistryObject<Item> registerIVMaxerItem(String name, Stat statToBoost) {
        return ITEMS.register(name, () -> new IVMaxerItem(statToBoost));
    }
    // Register IVRandomizer item type
    private static RegistryObject<Item> registerIVRandomItem(String name) {
        return ITEMS.register(name, IVRandomItem::new);
    }
    // Register EVMaxer item type
    private static RegistryObject<Item> registerEVMaxerItem(String name, Stat statToBoost) {
        return ITEMS.register(name, () -> new EVMaxerItem(statToBoost));
    }
    // Register EVRandom item type
    private static RegistryObject<Item> registerEVRandomItem(String name) {
        return ITEMS.register(name, EVRandomItem::new);
    }
    // Register LVLMaxer item type
    private static RegistryObject<Item> registerLVLMaxerItem(String name) {
        return ITEMS.register(name, LVLMaxerItem::new);
    }
    // Register LVLRandom item type
    private static RegistryObject<Item> registerLVLRandomItem(String name) {
        return ITEMS.register(name, LVLRandomItem::new);
    }
}


