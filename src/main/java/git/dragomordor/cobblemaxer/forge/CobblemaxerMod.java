package git.dragomordor.cobblemaxer.forge;

import com.cobblemon.mod.common.item.group.CobblemonItemGroups;
import com.cobblemon.mod.common.item.group.CobblemonItemGroups.*;
import git.dragomordor.cobblemaxer.forge.item.CobblemaxerItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(CobblemaxerMod.MODID) // Mod registration
public final class CobblemaxerMod {
    public static final Logger LOGGER = LogManager.getLogger(CobblemaxerMod.class); // create logger
    public static final String MODID = "cobblemaxer"; // mod ID
    public CobblemaxerMod() {
        MinecraftForge.EVENT_BUS.register(this);
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register all classes
        CobblemaxerItems.register(modEventBus);


        // listeners
        modEventBus.addListener(this::commonSetup); //common setup event bus listener
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);  // creative mode tab event bus listener
    }

    // new functions
    private void commonSetup(final FMLCommonSetupEvent event){
    }
    // Add to creative mode tabs
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        // add to cobblemon consumables tab
        if (event.getTabKey() == CobblemonItemGroups.getCONSUMABLES_KEY()) {

            event.accept(CobblemaxerItems.SPDEF_IV_MAXER);
            event.accept(CobblemaxerItems.SPATK_IV_MAXER);
            event.accept(CobblemaxerItems.SPD_IV_MAXER);
            event.accept(CobblemaxerItems.DEF_IV_MAXER);
            event.accept(CobblemaxerItems.ATK_IV_MAXER);
            event.accept(CobblemaxerItems.HP_IV_MAXER);
            event.accept(CobblemaxerItems.ALL_IV_MAXER);
            event.accept(CobblemaxerItems.IV_RANDOM);
            event.accept(CobblemaxerItems.SPDEF_EV_MAXER);
            event.accept(CobblemaxerItems.SPATK_EV_MAXER);
            event.accept(CobblemaxerItems.SPD_EV_MAXER);
            event.accept(CobblemaxerItems.DEF_EV_MAXER);
            event.accept(CobblemaxerItems.ATK_EV_MAXER);
            event.accept(CobblemaxerItems.HP_EV_MAXER);
            event.accept(CobblemaxerItems.EV_RANDOM);
            event.accept(CobblemaxerItems.LVL_MAXER);
            event.accept(CobblemaxerItems.LVL_RANDOM);

        }
    }
}