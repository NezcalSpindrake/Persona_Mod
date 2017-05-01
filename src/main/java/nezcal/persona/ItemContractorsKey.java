package nezcal.persona;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityHanging;
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

import javax.annotation.Nullable;


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
            EntityHanging entityhanging = this.createEntity(worldIn, blockPos, facing);
        }
    }



    @Nullable
    private EntityHanging createEntity(World worldIn, BlockPos pos, EnumFacing clickedSide) {
        return (EntityHanging)(this.);
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}


