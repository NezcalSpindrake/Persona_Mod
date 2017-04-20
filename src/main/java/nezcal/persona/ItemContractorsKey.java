package nezcal.persona;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
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
        setUnlocalizedName(main.MODID + ".itemContractorsKey");     // Used for localization (en_US.lang)
        GameRegistry.register(this);
        setCreativeTab(CreativeTabs.TOOLS);
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }


}
