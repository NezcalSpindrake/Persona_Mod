package nezcal.persona.blocks;

import jline.internal.Nullable;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import nezcal.persona.handlers.DefaultDimensionHandler;
import nezcal.persona.handlers.IDimensionDataHandler;
import nezcal.persona.tile.VelvetDoor;

import java.util.Random;


/**
 * Created by nezcal on 5/5/2017 at 11:44 AM.
 */
public class BlockVelvetDoor extends PersonaBlock implements ITileEntityProvider {

    public static final PropertyBool UPPER = PropertyBool.create("upper");

    public BlockVelvetDoor(){
        super("block_velvet_door", Material.GLASS, SoundType.GLASS, 0, 0);
    }



    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new VelvetDoor();
    }

    private VelvetDoor getTE(World world, BlockPos pos) {
        return (VelvetDoor) world.getTileEntity(pos);
    }

    @Nullable
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return null;
    }

    @Override
    public void onBlockHarvested(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
        if (state.getValue(UPPER)) {
            if (world.getBlockState(pos.down()).getBlock() == this) {
                if (player.capabilities.isCreativeMode) {
                    world.setBlockToAir(pos.down());
                } else {
                    world.destroyBlock(pos.down(), false);
                    if (world.isRemote) {
                        world.setBlockToAir(pos.down());
                    }
                }
            }
        }
    }


    @Override
    public void onEntityCollidedWithBlock(World world, BlockPos pos, IBlockState state, Entity entityIn) {
        if (entityIn instanceof EntityPlayer){
            if (DefaultDimensionHandler.getHandler(entityIn).getPlayerIsContractor()) {
                DefaultDimensionHandler.getHandler(entityIn).setPlayerPreviousDimension(world.provider.getDimension());
                DefaultDimensionHandler.getHandler(entityIn).setPlayerPreviousX(entityIn.getPosition().getX());
                DefaultDimensionHandler.getHandler(entityIn).setPlayerPreviousY(entityIn.getPosition().getY());
                DefaultDimensionHandler.getHandler(entityIn).setPlayerPreviousZ(entityIn.getPosition().getZ());

            }
        }
    }


}
