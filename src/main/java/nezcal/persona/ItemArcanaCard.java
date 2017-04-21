package nezcal.persona;


import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by nezcal on 4/19/2017 at 11:43 PM.
 */
public class ItemArcanaCard extends Item {
    public ItemArcanaCard() {
        setRegistryName("itemArcanaCard");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName(PersonaMod.MODID + ".itemArcanaCard");     // Used for localization (en_US.lang)
        GameRegistry.register(this);
        setCreativeTab(PersonaMod.creativeTab);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
