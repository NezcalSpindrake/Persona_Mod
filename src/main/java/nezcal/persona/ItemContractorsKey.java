package nezcal.persona;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;



/**
 * Created by nezcal on 4/20/2017 at 1:50 PM.
 */
public class ItemContractorsKey extends Item {
    public ItemContractorsKey() {

        setRegistryName("itemContractorsKey");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName(PersonaMod.MODID + ".itemContractorsKey");     // Used for localization (en_US.lang)
        GameRegistry.register(this);
        setCreativeTab(PersonaMod.creativeTab);
    }
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, Enum hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        ItemStack itemStack = player.getHeldItem(null);
        BlockPos blockPos = pos.offset(facing);

        if (facing != EnumFacing.DOWN && facing != EnumFacing.UP && player.canPlayerEdit(blockPos, facing, itemStack)) {
            worldIn.spawnEntity(new EntityVelvetDoor(worldIn, blockPos));
            return EnumActionResult.SUCCESS;
        } else{
            return EnumActionResult.FAIL;
        }

    }




    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}


