package nezcal.persona.handlers;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraft.util.EnumFacing;

/**
 * Created by nezcal on 5/5/2017 at 2:19 PM.
 */
public class Storage implements Capability.IStorage<IDimensionDataHandler> {

    @Override
    public NBTBase writeNBT(Capability<IDimensionDataHandler> capability, IDimensionDataHandler instance, EnumFacing side)
    {
        final NBTTagCompound tag = new NBTTagCompound();
        tag.setInteger("previousDimension", instance.getPlayerPreviousDimension());
        tag.setInteger("previousX", instance.getPlayerPreviousX());
        tag.setInteger("previousY", instance.getPlayerPreviousY());
        tag.setInteger("previousZ", instance.getPlayerPreviousZ());
        return tag;
    }

    @Override
    public void readNBT(Capability<IDimensionDataHandler> capability, IDimensionDataHandler instance, EnumFacing side, NBTBase nbt)
    {
        final NBTTagCompound tag = (NBTTagCompound) nbt;
        instance.setPlayerPreviousDimension(tag.getInteger("previousDimension"));
        instance.setPlayerPreviousX(tag.getInteger("previousX"));
        instance.setPlayerPreviousY(tag.getInteger("previousY"));
        instance.setPlayerPreviousZ(tag.getInteger("previousZ"));
    }
}
