package git.dragomordor.cobblemizer.forge;

import git.dragomordor.cobblemizer.forge.item.CobblemizerItems;
import git.dragomordor.cobblemizer.forge.item.CobblemizerItemGroups;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(CobblemizerMod.MODID) // Mod registration
public final class CobblemizerMod {
    public static final Logger LOGGER = LogManager.getLogger(CobblemizerMod.class); // create logger
    public static final String MODID = "cobblemizer"; // mod ID
    public CobblemizerMod() {
        MinecraftForge.EVENT_BUS.register(this);
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // creative mode tab
        CobblemizerItemGroups.register(modEventBus);
        // Register all items
        CobblemizerItems.register(modEventBus);


        // listeners
        modEventBus.addListener(this::commonSetup); //common setup event bus listener
        MinecraftForge.EVENT_BUS.register(this);
    }

    // new functions
    private void commonSetup(final FMLCommonSetupEvent event){
    }
}