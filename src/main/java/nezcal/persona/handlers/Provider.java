package nezcal.persona.handlers;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

import static nezcal.persona.main.PersonaMod.CAPABILITY_DIMENSION_DATA;

/**
 * Created by nezcal on 5/5/2017 at 2:36 PM.
 */
public class Provider implements ICapabilitySerializable<NBTTagCompound> {
    IDimensionDataHandler instance = CAPABILITY_DIMENSION_DATA.getDefaultInstance();

    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing facing)
    {
        return capability == CAPABILITY_DIMENSION_DATA;
    }

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing)
    {
        return hasCapability(capability, facing) ? CAPABILITY_DIMENSION_DATA.<T>cast(instance) : null;
    }

    @Override
    public NBTTagCompound serializeNBT()
    {
        return (NBTTagCompound) CAPABILITY_DIMENSION_DATA.getStorage().writeNBT(CAPABILITY_DIMENSION_DATA, instance, null);
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt)
    {
        CAPABILITY_DIMENSION_DATA.getStorage().readNBT(CAPABILITY_DIMENSION_DATA, instance, null, nbt);
    }
}
