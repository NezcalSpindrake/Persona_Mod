package nezcal.persona;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityHanging;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import javax.annotation.Nullable;

/**
 * Created by nezcal on 5/1/2017 at 10:14 AM.
 */
public class EntityVelvetDoor extends EntityHanging {
    public EntityVelvetDoor(World worldIn){super(worldIn);}
    public EntityVelvetDoor(World worldIn, BlockPos hangingPositionIn) {
        super(worldIn, hangingPositionIn);
    }

    @Override
    public int getHeightPixels() {
        return 32;
    }

    @Override
    public void playPlaceSound() {

    }

    @Override
    public void onBroken(@Nullable Entity brokenEntity) {

    }

    @Override
    public int getWidthPixels() {
        return 16;
    }

    @Override
    public void onCollideWithPlayer(EntityPlayer entityIn)
    {
        int previousDimension = 0;
        if (world.provider.getDimension() != Config.dimensionId) {
            previousDimension = world.provider.getDimension();
            CustomTeleporter.teleportToDimension(entityIn, Config.dimensionId, 0, 100, 0);
        } else if (world.provider.getDimension() == Config.dimensionId){
            CustomTeleporter.teleportToDimension(entityIn, previousDimension, 0, 100, 0);
        }
    }


}
