package nezcal.persona;


import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;


/**
 * Created by nezcal on 4/19/2017 at 11:33 PM at 11:33 PM.
 */
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
       // Initialization of blocks and items typically goes here:
       // ModBlocks.init();
        ModItems.init();
       // ModCrafting.init();
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
