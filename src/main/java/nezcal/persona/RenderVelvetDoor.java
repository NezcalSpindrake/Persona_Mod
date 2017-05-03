package nezcal.persona;

import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPainting;
import net.minecraft.util.ResourceLocation;

/**
 * Created by nezcal on 5/1/2017 at 12:15 PM.
 */
public class RenderVelvetDoor extends RenderPainting {

    private static final ResourceLocation velvetDoor = new ResourceLocation("persona:entities/entityvelvetdoor");
    public RenderVelvetDoor(RenderManager renderManagerIn) {
        super(renderManagerIn);
    }

}
