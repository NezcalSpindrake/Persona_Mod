package nezcal.persona;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;


/**
 * Created by nezcal on 4/19/2017 at 11:33 PM.
 */

@Mod(modid = PersonaMod.MODID, name = PersonaMod.MODNAME, version = PersonaMod.MODVERSION, useMetadata = true)
public class PersonaMod {
    public static final String MODID = "persona";
    public static final String MODNAME = "Persona";
    public static final String MODVERSION = "0.0.1";

    @SidedProxy(clientSide = "nezcal.persona.ClientProxy", serverSide = "nezcal.persona.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static PersonaMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }



    public static final PersonaTab creativeTab = new PersonaTab();
}
