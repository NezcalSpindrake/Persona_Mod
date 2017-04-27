package nezcal.persona;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by nezcal on 4/27/2017 at 7:28 AM.
 */
public class ItemEvoker extends Item {
    public ItemEvoker() {
        setRegistryName("itemEvoker");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName(PersonaMod.MODID + ".itemEvoker");     // Used for localization (en_US.lang)
        GameRegistry.register(this);
        setCreativeTab(PersonaMod.creativeTab);
        setMaxStackSize(1);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }


}
