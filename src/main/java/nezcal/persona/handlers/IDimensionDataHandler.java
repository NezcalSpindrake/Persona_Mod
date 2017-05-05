package nezcal.persona.handlers;

/**
 * Created by nezcal on 5/5/2017 at 1:34 PM.
 */
public interface IDimensionDataHandler {
    int getPlayerPreviousDimension();
    int getPlayerPreviousX();
    int getPlayerPreviousY();
    int getPlayerPreviousZ();
    void setPlayerPreviousDimension(int dimension);
    void setPlayerPreviousX(int playerX);
    void setPlayerPreviousY(int playerY);
    void setPlayerPreviousZ(int playerZ);
}
