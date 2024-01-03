package git.dragomordor.cobblemizer.forge.item;

import com.cobblemon.mod.common.api.pokeball.PokeBalls;
import com.cobblemon.mod.common.api.pokemon.Natures;
import com.cobblemon.mod.common.api.pokemon.stats.Stat;
import com.cobblemon.mod.common.api.pokemon.stats.Stats;
import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.cobblemon.mod.common.pokeball.PokeBall;
import com.cobblemon.mod.common.pokemon.Nature;
import com.cobblemon.mod.common.pokemon.Pokemon;
import git.dragomordor.cobblemizer.forge.CobblemizerMod;
import git.dragomordor.cobblemizer.forge.item.custom.*;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CobblemizerItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CobblemizerMod.MODID);

    // register IVMaxerItems
    public static final RegistryObject<Item> ALL_IV_MAXER = registerIVMaxerItem("all_iv_maxer");
    // register IVRandomItem
    public static final RegistryObject<Item> IV_RANDOM = registerIVRandomItem("iv_random");
    // register EVRandomItem
    public static final RegistryObject<Item> EV_RANDOM = registerEVRandomItem("ev_random");
    //register LVLRandomItem
    public static final RegistryObject<Item> LVL_RANDOM = registerLVLRandomItem("level_random");
    // version 1.1.0 items
    // register GenderSwapItem
    public static final RegistryObject<Item> GENDER_SWAPPER = registerGenderSwapItem("gender_swapper");
    //ShinySwapItems
    public static final RegistryObject<Item> SHINY_SWAPPER = registerShinySwapItem("shiny_swapper");
    //CaughtBallChangerItem
            // no ancient balls in release version of cobblemon yet
    public static final RegistryObject<Item> AZURE_BALL_CB_CHANGER = registerCaughtBallChangerItem("azure_ball_cb_changer", PokeBalls.INSTANCE.getAZURE_BALL());
    public static final RegistryObject<Item> BEAST_BALL_CB_CHANGER = registerCaughtBallChangerItem("beast_ball_cb_changer", PokeBalls.INSTANCE.getBEAST_BALL());
    public static final RegistryObject<Item> CHERISH_BALL_CB_CHANGER = registerCaughtBallChangerItem("cherish_ball_cb_changer", PokeBalls.INSTANCE.getCHERISH_BALL());
    public static final RegistryObject<Item> CITRINE_BALL_CB_CHANGER = registerCaughtBallChangerItem("citrine_ball_cb_changer", PokeBalls.INSTANCE.getCITRINE_BALL());
    public static final RegistryObject<Item> DIVE_BALL_CB_CHANGER = registerCaughtBallChangerItem("dive_ball_cb_changer", PokeBalls.INSTANCE.getDIVE_BALL());
    public static final RegistryObject<Item> DREAM_BALL_CB_CHANGER = registerCaughtBallChangerItem("dream_ball_cb_changer", PokeBalls.INSTANCE.getDREAM_BALL());
    public static final RegistryObject<Item> DUSK_BALL_CB_CHANGER = registerCaughtBallChangerItem("dusk_ball_cb_changer", PokeBalls.INSTANCE.getDUSK_BALL());
    public static final RegistryObject<Item> FAST_BALL_CB_CHANGER = registerCaughtBallChangerItem("fast_ball_cb_changer", PokeBalls.INSTANCE.getFAST_BALL());
    public static final RegistryObject<Item> FRIEND_BALL_CB_CHANGER = registerCaughtBallChangerItem("friend_ball_cb_changer", PokeBalls.INSTANCE.getFRIEND_BALL());
    public static final RegistryObject<Item> GREAT_BALL_CB_CHANGER = registerCaughtBallChangerItem("great_ball_cb_changer", PokeBalls.INSTANCE.getGREAT_BALL());
    public static final RegistryObject<Item> HEAL_BALL_CB_CHANGER = registerCaughtBallChangerItem("heal_ball_cb_changer", PokeBalls.INSTANCE.getHEAL_BALL());
    public static final RegistryObject<Item> HEAVY_BALL_CB_CHANGER = registerCaughtBallChangerItem("heavy_ball_cb_changer", PokeBalls.INSTANCE.getHEAVY_BALL());
    public static final RegistryObject<Item> LEVEL_BALL_CB_CHANGER = registerCaughtBallChangerItem("level_ball_cb_changer", PokeBalls.INSTANCE.getLEVEL_BALL());
    public static final RegistryObject<Item> LOVE_BALL_CB_CHANGER = registerCaughtBallChangerItem("love_ball_cb_changer", PokeBalls.INSTANCE.getLOVE_BALL());
    public static final RegistryObject<Item> LURE_BALL_CB_CHANGER = registerCaughtBallChangerItem("lure_ball_cb_changer", PokeBalls.INSTANCE.getLURE_BALL());
    public static final RegistryObject<Item> LUXURY_BALL_CB_CHANGER = registerCaughtBallChangerItem("luxury_ball_cb_changer", PokeBalls.INSTANCE.getLUXURY_BALL());
    public static final RegistryObject<Item> MASTER_BALL_CB_CHANGER = registerCaughtBallChangerItem("master_ball_cb_changer", PokeBalls.INSTANCE.getMASTER_BALL());
    public static final RegistryObject<Item> MOON_BALL_CB_CHANGER = registerCaughtBallChangerItem("moon_ball_cb_changer", PokeBalls.INSTANCE.getMOON_BALL());
    public static final RegistryObject<Item> NEST_BALL_CB_CHANGER = registerCaughtBallChangerItem("nest_ball_cb_changer", PokeBalls.INSTANCE.getNEST_BALL());
    public static final RegistryObject<Item> NET_BALL_CB_CHANGER = registerCaughtBallChangerItem("net_ball_cb_changer", PokeBalls.INSTANCE.getNET_BALL());
    public static final RegistryObject<Item> PARK_BALL_CB_CHANGER = registerCaughtBallChangerItem("park_ball_cb_changer", PokeBalls.INSTANCE.getPARK_BALL());
    public static final RegistryObject<Item> POKE_BALL_CB_CHANGER = registerCaughtBallChangerItem("poke_ball_cb_changer", PokeBalls.INSTANCE.getPOKE_BALL());
    public static final RegistryObject<Item> PREMIER_BALL_CB_CHANGER = registerCaughtBallChangerItem("premier_ball_cb_changer", PokeBalls.INSTANCE.getPREMIER_BALL());
    public static final RegistryObject<Item> REPEAT_BALL_CB_CHANGER = registerCaughtBallChangerItem("repeat_ball_cb_changer", PokeBalls.INSTANCE.getREPEAT_BALL());
    public static final RegistryObject<Item> ROSEATE_BALL_CB_CHANGER = registerCaughtBallChangerItem("roseate_ball_cb_changer", PokeBalls.INSTANCE.getROSEATE_BALL());
    public static final RegistryObject<Item> SAFARI_BALL_CB_CHANGER = registerCaughtBallChangerItem("safari_ball_cb_changer", PokeBalls.INSTANCE.getSAFARI_BALL());
    public static final RegistryObject<Item> SLATE_BALL_CB_CHANGER = registerCaughtBallChangerItem("slate_ball_cb_changer", PokeBalls.INSTANCE.getSLATE_BALL());
    public static final RegistryObject<Item> SPORT_BALL_CB_CHANGER = registerCaughtBallChangerItem("sport_ball_cb_changer", PokeBalls.INSTANCE.getSPORT_BALL());
    public static final RegistryObject<Item> TIMER_BALL_CB_CHANGER = registerCaughtBallChangerItem("timer_ball_cb_changer", PokeBalls.INSTANCE.getTIMER_BALL());
    public static final RegistryObject<Item> ULTRA_BALL_CB_CHANGER = registerCaughtBallChangerItem("ultra_ball_cb_changer", PokeBalls.INSTANCE.getULTRA_BALL());
    public static final RegistryObject<Item> VERDANT_BALL_CB_CHANGER = registerCaughtBallChangerItem("verdant_ball_cb_changer", PokeBalls.INSTANCE.getVERDANT_BALL());
    //FriendshipAddItem
    public static final RegistryObject<Item> FRIENDSHIP_ADD_COMMON = registerFriendshipAddItem("friendship_add_common", "COMMON");
    public static final RegistryObject<Item> FRIENDSHIP_ADD_UNCOMMON = registerFriendshipAddItem("friendship_add_uncommon", "UNCOMMON");
    public static final RegistryObject<Item> FRIENDSHIP_ADD_RARE = registerFriendshipAddItem("friendship_add_rare", "RARE");
    public static final RegistryObject<Item> FRIENDSHIP_ADD_EPIC = registerFriendshipAddItem("friendship_add_epic", "EPIC");
    public static final RegistryObject<Item> FRIENDSHIP_ADD_LEGENDARY = registerFriendshipAddItem("friendship_add_legendary", "LEGENDARY");
    public static final RegistryObject<Item> FRIENDSHIP_ADD_MAX = registerFriendshipAddItem("friendship_add_max", "MAX");
    // EVAddItem
    public static final RegistryObject<Item> EV_ADD_SP_DEF_COMMON = registerEVAddItem("ev_add_sp_def_common", "COMMON", Stats.SPECIAL_DEFENCE);
    public static final RegistryObject<Item> EV_ADD_SP_DEF_UNCOMMON = registerEVAddItem("ev_add_sp_def_uncommon", "UNCOMMON", Stats.SPECIAL_DEFENCE);
    public static final RegistryObject<Item> EV_ADD_SP_DEF_RARE = registerEVAddItem("ev_add_sp_def_rare", "RARE", Stats.SPECIAL_DEFENCE);
    public static final RegistryObject<Item> EV_ADD_SP_DEF_EPIC = registerEVAddItem("ev_add_sp_def_epic", "EPIC", Stats.SPECIAL_DEFENCE);
    public static final RegistryObject<Item> EV_ADD_SP_DEF_LEGENDARY = registerEVAddItem("ev_add_sp_def_legendary", "LEGENDARY", Stats.SPECIAL_DEFENCE);
    public static final RegistryObject<Item> EV_ADD_SP_DEF_MAX = registerEVAddItem("ev_add_sp_def_max", "MAX", Stats.SPECIAL_DEFENCE);
    public static final RegistryObject<Item> EV_ADD_SP_ATK_COMMON = registerEVAddItem("ev_add_sp_atk_common", "COMMON", Stats.SPECIAL_ATTACK);
    public static final RegistryObject<Item> EV_ADD_SP_ATK_UNCOMMON = registerEVAddItem("ev_add_sp_atk_uncommon", "UNCOMMON", Stats.SPECIAL_ATTACK);
    public static final RegistryObject<Item> EV_ADD_SP_ATK_RARE = registerEVAddItem("ev_add_sp_atk_rare", "RARE", Stats.SPECIAL_ATTACK);
    public static final RegistryObject<Item> EV_ADD_SP_ATK_EPIC = registerEVAddItem("ev_add_sp_atk_epic", "EPIC", Stats.SPECIAL_ATTACK);
    public static final RegistryObject<Item> EV_ADD_SP_ATK_LEGENDARY = registerEVAddItem("ev_add_sp_atk_legendary", "LEGENDARY", Stats.SPECIAL_ATTACK);
    public static final RegistryObject<Item> EV_ADD_SP_ATK_MAX = registerEVAddItem("ev_add_sp_atk_max", "MAX", Stats.SPECIAL_ATTACK);
    public static final RegistryObject<Item> EV_ADD_SPEED_COMMON = registerEVAddItem("ev_add_speed_common", "COMMON", Stats.SPEED);
    public static final RegistryObject<Item> EV_ADD_SPEED_UNCOMMON = registerEVAddItem("ev_add_speed_uncommon", "UNCOMMON", Stats.SPEED);
    public static final RegistryObject<Item> EV_ADD_SPEED_RARE = registerEVAddItem("ev_add_speed_rare", "RARE", Stats.SPEED);
    public static final RegistryObject<Item> EV_ADD_SPEED_EPIC = registerEVAddItem("ev_add_speed_epic", "EPIC", Stats.SPEED);
    public static final RegistryObject<Item> EV_ADD_SPEED_LEGENDARY = registerEVAddItem("ev_add_speed_legendary", "LEGENDARY", Stats.SPEED);
    public static final RegistryObject<Item> EV_ADD_SPEED_MAX = registerEVAddItem("ev_add_speed_max", "MAX", Stats.SPEED);
    public static final RegistryObject<Item> EV_ADD_ATK_COMMON = registerEVAddItem("ev_add_atk_common", "COMMON", Stats.ATTACK);
    public static final RegistryObject<Item> EV_ADD_ATK_UNCOMMON = registerEVAddItem("ev_add_atk_uncommon", "UNCOMMON", Stats.ATTACK);
    public static final RegistryObject<Item> EV_ADD_ATK_RARE = registerEVAddItem("ev_add_atk_rare", "RARE", Stats.ATTACK);
    public static final RegistryObject<Item> EV_ADD_ATK_EPIC = registerEVAddItem("ev_add_atk_epic", "EPIC", Stats.ATTACK);
    public static final RegistryObject<Item> EV_ADD_ATK_LEGENDARY = registerEVAddItem("ev_add_atk_legendary", "LEGENDARY", Stats.ATTACK);
    public static final RegistryObject<Item> EV_ADD_ATK_MAX = registerEVAddItem("ev_add_atk_max", "MAX", Stats.ATTACK);
    public static final RegistryObject<Item> EV_ADD_DEF_COMMON = registerEVAddItem("ev_add_def_common", "COMMON", Stats.DEFENCE);
    public static final RegistryObject<Item> EV_ADD_DEF_UNCOMMON = registerEVAddItem("ev_add_def_uncommon", "UNCOMMON", Stats.DEFENCE);
    public static final RegistryObject<Item> EV_ADD_DEF_RARE = registerEVAddItem("ev_add_def_rare", "RARE", Stats.DEFENCE);
    public static final RegistryObject<Item> EV_ADD_DEF_EPIC = registerEVAddItem("ev_add_def_epic", "EPIC", Stats.DEFENCE);
    public static final RegistryObject<Item> EV_ADD_DEF_LEGENDARY = registerEVAddItem("ev_add_def_legendary", "LEGENDARY", Stats.DEFENCE);
    public static final RegistryObject<Item> EV_ADD_DEF_MAX = registerEVAddItem("ev_add_def_max", "MAX", Stats.DEFENCE);
    public static final RegistryObject<Item> EV_ADD_HP_COMMON = registerEVAddItem("ev_add_hp_common", "COMMON", Stats.HP);
    public static final RegistryObject<Item> EV_ADD_HP_UNCOMMON = registerEVAddItem("ev_add_hp_uncommon", "UNCOMMON", Stats.HP);
    public static final RegistryObject<Item> EV_ADD_HP_RARE = registerEVAddItem("ev_add_hp_rare", "RARE", Stats.HP);
    public static final RegistryObject<Item> EV_ADD_HP_EPIC = registerEVAddItem("ev_add_hp_epic", "EPIC", Stats.HP);
    public static final RegistryObject<Item> EV_ADD_HP_LEGENDARY = registerEVAddItem("ev_add_hp_legendary", "LEGENDARY", Stats.HP);
    public static final RegistryObject<Item> EV_ADD_HP_MAX = registerEVAddItem("ev_add_hp_max", "MAX", Stats.HP);
    // IVAddItem
    public static final RegistryObject<Item> IV_ADD_SP_DEF_COMMON = registerIVAddItem("iv_add_sp_def_common", "COMMON", Stats.SPECIAL_DEFENCE);
    public static final RegistryObject<Item> IV_ADD_SP_DEF_UNCOMMON = registerIVAddItem("iv_add_sp_def_uncommon", "UNCOMMON", Stats.SPECIAL_DEFENCE);
    public static final RegistryObject<Item> IV_ADD_SP_DEF_RARE = registerIVAddItem("iv_add_sp_def_rare", "RARE", Stats.SPECIAL_DEFENCE);
    public static final RegistryObject<Item> IV_ADD_SP_DEF_EPIC = registerIVAddItem("iv_add_sp_def_epic", "EPIC", Stats.SPECIAL_DEFENCE);
    public static final RegistryObject<Item> IV_ADD_SP_DEF_LEGENDARY = registerIVAddItem("iv_add_sp_def_legendary", "LEGENDARY", Stats.SPECIAL_DEFENCE);
    public static final RegistryObject<Item> IV_ADD_SP_DEF_MAX = registerIVAddItem("iv_add_sp_def_max", "MAX", Stats.SPECIAL_DEFENCE);
    public static final RegistryObject<Item> IV_ADD_SP_ATK_COMMON = registerIVAddItem("iv_add_sp_atk_common", "COMMON", Stats.SPECIAL_ATTACK);
    public static final RegistryObject<Item> IV_ADD_SP_ATK_UNCOMMON = registerIVAddItem("iv_add_sp_atk_uncommon", "UNCOMMON", Stats.SPECIAL_ATTACK);
    public static final RegistryObject<Item> IV_ADD_SP_ATK_RARE = registerIVAddItem("iv_add_sp_atk_rare", "RARE", Stats.SPECIAL_ATTACK);
    public static final RegistryObject<Item> IV_ADD_SP_ATK_EPIC = registerIVAddItem("iv_add_sp_atk_epic", "EPIC", Stats.SPECIAL_ATTACK);
    public static final RegistryObject<Item> IV_ADD_SP_ATK_LEGENDARY = registerIVAddItem("iv_add_sp_atk_legendary", "LEGENDARY", Stats.SPECIAL_ATTACK);
    public static final RegistryObject<Item> IV_ADD_SP_ATK_MAX = registerIVAddItem("iv_add_sp_atk_max", "MAX", Stats.SPECIAL_ATTACK);
    public static final RegistryObject<Item> IV_ADD_SPEED_COMMON = registerIVAddItem("iv_add_speed_common", "COMMON", Stats.SPEED);
    public static final RegistryObject<Item> IV_ADD_SPEED_UNCOMMON = registerIVAddItem("iv_add_speed_uncommon", "UNCOMMON", Stats.SPEED);
    public static final RegistryObject<Item> IV_ADD_SPEED_RARE = registerIVAddItem("iv_add_speed_rare", "RARE", Stats.SPEED);
    public static final RegistryObject<Item> IV_ADD_SPEED_EPIC = registerIVAddItem("iv_add_speed_epic", "EPIC", Stats.SPEED);
    public static final RegistryObject<Item> IV_ADD_SPEED_LEGENDARY = registerIVAddItem("iv_add_speed_legendary", "LEGENDARY", Stats.SPEED);
    public static final RegistryObject<Item> IV_ADD_SPEED_MAX = registerIVAddItem("iv_add_speed_max", "MAX", Stats.SPEED);
    public static final RegistryObject<Item> IV_ADD_ATK_COMMON = registerIVAddItem("iv_add_atk_common", "COMMON", Stats.ATTACK);
    public static final RegistryObject<Item> IV_ADD_ATK_UNCOMMON = registerIVAddItem("iv_add_atk_uncommon", "UNCOMMON", Stats.ATTACK);
    public static final RegistryObject<Item> IV_ADD_ATK_RARE = registerIVAddItem("iv_add_atk_rare", "RARE", Stats.ATTACK);
    public static final RegistryObject<Item> IV_ADD_ATK_EPIC = registerIVAddItem("iv_add_atk_epic", "EPIC", Stats.ATTACK);
    public static final RegistryObject<Item> IV_ADD_ATK_LEGENDARY = registerIVAddItem("iv_add_atk_legendary", "LEGENDARY", Stats.ATTACK);
    public static final RegistryObject<Item> IV_ADD_ATK_MAX = registerIVAddItem("iv_add_atk_max", "MAX", Stats.ATTACK);
    public static final RegistryObject<Item> IV_ADD_DEF_COMMON = registerIVAddItem("iv_add_def_common", "COMMON", Stats.DEFENCE);
    public static final RegistryObject<Item> IV_ADD_DEF_UNCOMMON = registerIVAddItem("iv_add_def_uncommon", "UNCOMMON", Stats.DEFENCE);
    public static final RegistryObject<Item> IV_ADD_DEF_RARE = registerIVAddItem("iv_add_def_rare", "RARE", Stats.DEFENCE);
    public static final RegistryObject<Item> IV_ADD_DEF_EPIC = registerIVAddItem("iv_add_def_epic", "EPIC", Stats.DEFENCE);
    public static final RegistryObject<Item> IV_ADD_DEF_LEGENDARY = registerIVAddItem("iv_add_def_legendary", "LEGENDARY", Stats.DEFENCE);
    public static final RegistryObject<Item> IV_ADD_DEF_MAX = registerIVAddItem("iv_add_def_max", "MAX", Stats.DEFENCE);
    public static final RegistryObject<Item> IV_ADD_HP_COMMON = registerIVAddItem("iv_add_hp_common", "COMMON", Stats.HP);
    public static final RegistryObject<Item> IV_ADD_HP_UNCOMMON = registerIVAddItem("iv_add_hp_uncommon", "UNCOMMON", Stats.HP);
    public static final RegistryObject<Item> IV_ADD_HP_RARE = registerIVAddItem("iv_add_hp_rare", "RARE", Stats.HP);
    public static final RegistryObject<Item> IV_ADD_HP_EPIC = registerIVAddItem("iv_add_hp_epic", "EPIC", Stats.HP);
    public static final RegistryObject<Item> IV_ADD_HP_LEGENDARY = registerIVAddItem("iv_add_hp_legendary", "LEGENDARY", Stats.HP);
    public static final RegistryObject<Item> IV_ADD_HP_MAX = registerIVAddItem("iv_add_hp_max", "MAX", Stats.HP);
    // LVLAddItem
    public static final RegistryObject<Item> LVL_ADD_COMMON = registerLVLAddItem("lvl_add_common", "COMMON");
    public static final RegistryObject<Item> LVL_ADD_UNCOMMON = registerLVLAddItem("lvl_add_uncommon", "COMMON");
    public static final RegistryObject<Item> LVL_ADD_RARE = registerLVLAddItem("lvl_add_rare", "COMMON");
    public static final RegistryObject<Item> LVL_ADD_EPIC = registerLVLAddItem("lvl_add_epic", "COMMON");
    public static final RegistryObject<Item> LVL_ADD_LEGENDARY = registerLVLAddItem("lvl_add_legendary", "COMMON");
    public static final RegistryObject<Item> LVL_ADD_MAX = registerLVLAddItem("lvl_add_max", "COMMON");
    // NatureChangerItem
    public static final RegistryObject<Item> NATURE_CHANGER_ADAMANT = registerNatureChangerItem("nature_changer_adamant", Natures.INSTANCE.getADAMANT());
    public static final RegistryObject<Item> NATURE_CHANGER_BASHFUL = registerNatureChangerItem("nature_changer_bashful", Natures.INSTANCE.getBASHFUL());
    public static final RegistryObject<Item> NATURE_CHANGER_BOLD = registerNatureChangerItem("nature_changer_bold", Natures.INSTANCE.getBOLD());
    public static final RegistryObject<Item> NATURE_CHANGER_BRAVE = registerNatureChangerItem("nature_changer_brave", Natures.INSTANCE.getBRAVE());
    public static final RegistryObject<Item> NATURE_CHANGER_CALM = registerNatureChangerItem("nature_changer_calm", Natures.INSTANCE.getCALM());
    public static final RegistryObject<Item> NATURE_CHANGER_CAREFUL = registerNatureChangerItem("nature_changer_careful", Natures.INSTANCE.getCAREFUL());
    public static final RegistryObject<Item> NATURE_CHANGER_DOCILE = registerNatureChangerItem("nature_changer_docile", Natures.INSTANCE.getDOCILE());
    public static final RegistryObject<Item> NATURE_CHANGER_GENTLE = registerNatureChangerItem("nature_changer_gentle", Natures.INSTANCE.getGENTLE());
    public static final RegistryObject<Item> NATURE_CHANGER_HARDY = registerNatureChangerItem("nature_changer_hardy", Natures.INSTANCE.getHARDY());
    public static final RegistryObject<Item> NATURE_CHANGER_HASTY = registerNatureChangerItem("nature_changer_hasty", Natures.INSTANCE.getHASTY());
    public static final RegistryObject<Item> NATURE_CHANGER_IMPISH = registerNatureChangerItem("nature_changer_impish", Natures.INSTANCE.getIMPISH());
    public static final RegistryObject<Item> NATURE_CHANGER_JOLLY = registerNatureChangerItem("nature_changer_jolly", Natures.INSTANCE.getJOLLY());
    public static final RegistryObject<Item> NATURE_CHANGER_LAX = registerNatureChangerItem("nature_changer_lax", Natures.INSTANCE.getLAX());
    public static final RegistryObject<Item> NATURE_CHANGER_LONELY = registerNatureChangerItem("nature_changer_lonely", Natures.INSTANCE.getLONELY());
    public static final RegistryObject<Item> NATURE_CHANGER_MILD = registerNatureChangerItem("nature_changer_mild", Natures.INSTANCE.getMILD());
    public static final RegistryObject<Item> NATURE_CHANGER_MODEST = registerNatureChangerItem("nature_changer_modest", Natures.INSTANCE.getMODEST());
    public static final RegistryObject<Item> NATURE_CHANGER_NAIVE = registerNatureChangerItem("nature_changer_naive", Natures.INSTANCE.getNAIVE());
    public static final RegistryObject<Item> NATURE_CHANGER_NAUGHTY = registerNatureChangerItem("nature_changer_naughty", Natures.INSTANCE.getNAUGHTY());
    public static final RegistryObject<Item> NATURE_CHANGER_QUIET = registerNatureChangerItem("nature_changer_quiet", Natures.INSTANCE.getQUIET());
    public static final RegistryObject<Item> NATURE_CHANGER_QUIRKY = registerNatureChangerItem("nature_changer_quirky", Natures.INSTANCE.getQUIRKY());
    public static final RegistryObject<Item> NATURE_CHANGER_RASH = registerNatureChangerItem("nature_changer_rash", Natures.INSTANCE.getRASH());
    public static final RegistryObject<Item> NATURE_CHANGER_RELAXED = registerNatureChangerItem("nature_changer_relaxed", Natures.INSTANCE.getRELAXED());
    public static final RegistryObject<Item> NATURE_CHANGER_SASSY = registerNatureChangerItem("nature_changer_sassy", Natures.INSTANCE.getSASSY());
    public static final RegistryObject<Item> NATURE_CHANGER_SERIOUS = registerNatureChangerItem("nature_changer_serious", Natures.INSTANCE.getSERIOUS());
    public static final RegistryObject<Item> NATURE_CHANGER_TIMID = registerNatureChangerItem("nature_changer_timid", Natures.INSTANCE.getTIMID());


    // event bus
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    // Helper methods to simplify item registration
    //Register vanilla minecraft item type
    private static RegistryObject<Item> registerItem(String name) {
        return ITEMS.register(name, () -> new Item(new Item.Properties()));
    }
    //Register IVMaxer item type
    private static RegistryObject<Item> registerIVMaxerItem(String name) {
        return ITEMS.register(name, () -> new IVMaxerItem());
    }
    // Register IVRandomizer item type
    private static RegistryObject<Item> registerIVRandomItem(String name) {
        return ITEMS.register(name, IVRandomItem::new);
    }
    // Register EVRandom item type
    private static RegistryObject<Item> registerEVRandomItem(String name) {
        return ITEMS.register(name, EVRandomItem::new);
    }
    // Register LVLRandom item type
    private static RegistryObject<Item> registerLVLRandomItem(String name) {
        return ITEMS.register(name, LVLRandomItem::new);
    }
    // version 1.1.0 items
    // Register GenderSwapItem item type
    private static RegistryObject<Item> registerGenderSwapItem(String name) {
        return ITEMS.register(name, GenderSwapItem::new);
    }
    // Register ShinySwapItem item type
    private static RegistryObject<Item> registerShinySwapItem(String name) {
        return ITEMS.register(name, ShinySwapItem::new);
    }
    // Register CaightBallChanger item type
    private static RegistryObject<Item> registerCaughtBallChangerItem(String name, PokeBall selectBall) {
        return ITEMS.register(name, () -> new CaughtBallChangerItem(selectBall));
    }
    // Register FriendShipAdd item type
    private static RegistryObject<Item> registerFriendshipAddItem(String name, String tier) {
        return ITEMS.register(name, () -> new FriendshipAddItem(tier));
    }
    // Register EVAddItem item type
    private static RegistryObject<Item> registerEVAddItem(String name, String tier, Stat statToBoost) {
        return ITEMS.register(name, () -> new EVAddItem(tier, statToBoost));
    }
    // Register IVAddItem item type
    private static RegistryObject<Item> registerIVAddItem(String name, String tier, Stat statToBoost) {
        return ITEMS.register(name, () -> new IVAddItem(tier, statToBoost));
    }
    // Register LVLAddItem item type
    private static RegistryObject<Item> registerLVLAddItem(String name, String tier) {
        return ITEMS.register(name, () -> new LVLAddItem(tier));
    }
    // Register NatureChangerItem item type
    private static RegistryObject<Item> registerNatureChangerItem(String name, Nature nature) {
        return ITEMS.register(name, () -> new NatureChangerItem(nature));
    }
}


