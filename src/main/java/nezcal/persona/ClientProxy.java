package nezcal.persona;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import static nezcal.persona.ModItems.arcanaCard;


/**
 * Created by nezcal on 4/19/2017 at 11:33 PM.
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        // Typically initialization of models and such goes here:
        //ModRenderers.preInit();
        ModItems.initModels();
    }

}
