package nezcal.persona.dimension;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;
import nezcal.persona.main.Config;
import nezcal.persona.main.PersonaMod;

/**
 * Created by nezcal on 4/26/2017 at 3:59 AM.
 */
public class PersonaModDimensions {

    public static DimensionType velvetRoom;

    public static void init() {
        registerDimensionTypes();
        registerDimensions();
    }

    private static void registerDimensionTypes() {
        velvetRoom = DimensionType.register(PersonaMod.MODID, "_test", Config.dimensionId, VelvetRoomProvider.class, false);
    }

    private static void registerDimensions() {
        DimensionManager.registerDimension(Config.dimensionId, velvetRoom);
    }
}