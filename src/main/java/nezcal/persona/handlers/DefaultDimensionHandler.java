package nezcal.persona.handlers;

/**
 * Created by nezcal on 5/5/2017 at 1:47 PM.
 */
public class DefaultDimensionHandler implements IDimensionDataHandler {
    private int previousDimension;
    private int previousX;
    private int previousY;
    private int previousZ;

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
}
