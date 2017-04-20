package nezcal.persona;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


/**
 * Created by darkc_000 on 4/19/2017.
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        // Typically initialization of models and such goes here:
        //ModRenderers.preInit();
    }
}
