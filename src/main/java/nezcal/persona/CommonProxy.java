package nezcal.persona;


import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
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
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {
        if (config.hasChanged()) {
            config.save();
        }
    }
}
