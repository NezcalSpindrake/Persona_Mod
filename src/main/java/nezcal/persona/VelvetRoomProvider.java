package nezcal.persona;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkGenerator;

/**
 * Created by nezcal on 4/26/2017 at 5:18 AM.
 */
public class VelvetRoomProvider extends WorldProvider {

    @Override
    public DimensionType getDimensionType() {
        return PersonaModDimensions.velvetRoom;
    }

    @Override
    public String getSaveFolder() {
        return "TEST";
    }

    @Override
    public IChunkGenerator createChunkGenerator() {
        return new PersonaChunkGenerator(world);
    }
}
