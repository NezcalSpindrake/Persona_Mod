package nezcal.persona;

import net.minecraft.entity.EntityHanging;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


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
        RenderingRegistry.registerEntityRenderingHandler(EntityHanging.class, RenderVelvetDoor::new);
    }

}
