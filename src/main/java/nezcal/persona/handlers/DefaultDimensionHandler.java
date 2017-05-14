package nezcal.persona.handlers;

import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;

import static nezcal.persona.main.PersonaMod.CAPABILITY_DIMENSION_DATA;

/**
 * Created by nezcal on 5/5/2017 at 1:47 PM.
 */
public class DefaultDimensionHandler implements IDimensionDataHandler {
    private int previousDimension;
    private int previousX;
    private int previousY;
    private int previousZ;
    private boolean isContractor;

    @Override
    public int getPlayerPreviousDimension()
    {
        return this.previousDimension;
    }

    @Override
    public int getPlayerPreviousX()
    {
        return this.previousX;
    }

    @Override
    public int getPlayerPreviousY()
    {
        return this.previousY;
    }

    @Override
    public int getPlayerPreviousZ()
    {
        return this.previousZ;
    }

    @Override
    public boolean getPlayerIsContractor() {
        return this.isContractor;
    }

    @Override
    public void setPlayerPreviousDimension(int dimension)
    {
        this.previousDimension = dimension;
    }

    @Override
    public void setPlayerPreviousX(int playerX)
    {
        this.previousX = playerX;
    }

    @Override
    public void setPlayerPreviousY(int playerY)
    {
        this.previousY = playerY;
    }

    @Override
    public void setPlayerPreviousZ(int playerZ)
    {
        this.previousZ = playerZ;
    }

    @Override
    public void setPlayerIsContractor(boolean isContractor) {
        this.isContractor = isContractor;
    }

    public static IDimensionDataHandler getHandler(Entity entity) {

        if (entity.hasCapability(CAPABILITY_DIMENSION_DATA, EnumFacing.DOWN))
            return entity.getCapability(CAPABILITY_DIMENSION_DATA, EnumFacing.DOWN);
        return null;
    }
}
