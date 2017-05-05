package nezcal.persona.handlers;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import nezcal.persona.main.PersonaMod;

/**
 * Created by nezcal on 5/5/2017 at 2:54 PM.
 */
public class EventHandler {
    @SubscribeEvent
    public void attachCapabilities(AttachCapabilitiesEvent<Entity> event)
    {
        if (event.getObject() instanceof EntityPlayer)
        {
            event.addCapability(new ResourceLocation(PersonaMod.MODID, "DimensionData"), new Provider());
        }
    }

    /*@SubscribeEvent
    public void clonePlayer(PlayerEvent.Clone event) {

        final IDimensionDataHandler original = getHandler(event.getOriginal());
        final IDimensionDataHandler clone = getHandler(event.getEntity());
        clone.setPlayerPreviousDimension(original.getPlayerPreviousDimension());
    }*/
}
