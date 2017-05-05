package nezcal.persona.main;


import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import nezcal.persona.dimension.PersonaModDimensions;
import nezcal.persona.handlers.DefaultDimensionHandler;
import nezcal.persona.handlers.IDimensionDataHandler;
import nezcal.persona.handlers.Storage;
import nezcal.persona.item.ModItems;

import java.io.File;


/**
 * Created by nezcal on 4/19/2017 at 11:33 PM at 11:33 PM.
 */
public class CommonProxy {

    public static Configuration config;

    public void preInit(FMLPreInitializationEvent e) {
       // Initialization of blocks and items typically goes here:
       // ModBlocks.init();
        ModItems.init();
       // ModCrafting.init();
        PersonaModDimensions.init();
        File directory = e.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "Persona.cfg"));
        Config.readConfig();
        CapabilityManager.INSTANCE.register(IDimensionDataHandler.class, new Storage(), DefaultDimensionHandler.class);
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {
        if (config.hasChanged()) {
            config.save();
        }
    }
}
