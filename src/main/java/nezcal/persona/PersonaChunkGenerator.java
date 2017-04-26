package nezcal.persona;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.sun.istack.internal.Nullable;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkGenerator;

import java.util.List;
import java.util.Random;

/**
 * Created by nezcal on 4/26/2017 at 5:20 AM.
 */
public class PersonaChunkGenerator implements IChunkGenerator{

    private final World worldObj;

    private List<Biome.SpawnListEntry> mobs = Lists.newArrayList();

    public PersonaChunkGenerator(World worldObj) {
        this.worldObj = worldObj;

    }

    @Override
    public void populate(int x, int z) {

    }

    @Override
    public boolean generateStructures(Chunk chunkIn, int x, int z) {
        return false;
    }

    public BlockPos getStrongholdGen(World worldIn, String structureName, BlockPos position, boolean flag) {
        return null;
    }


    @Override
    public void recreateStructures(Chunk chunkIn, int x, int z) {

    }

    public Chunk provideChunk(int parChunkXIndex, int parChunkYIndex)
    {
        Chunk chunk = new Chunk(this.worldObj, parChunkXIndex, parChunkYIndex);
        chunk.generateSkylightMap();
        return chunk;
    }



    @Override
    public List<Biome.SpawnListEntry> getPossibleCreatures(EnumCreatureType creatureType, BlockPos pos) {

        if (creatureType == EnumCreatureType.MONSTER || creatureType == EnumCreatureType.CREATURE || creatureType == EnumCreatureType.AMBIENT || creatureType == EnumCreatureType.WATER_CREATURE){
            return mobs;
        }
        return ImmutableList.of();

    }
}
