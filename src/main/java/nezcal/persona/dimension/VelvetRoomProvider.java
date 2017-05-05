package nezcal.persona.dimension;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkGenerator;
import nezcal.persona.dimension.PersonaChunkGenerator;
import nezcal.persona.dimension.PersonaModDimensions;

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
