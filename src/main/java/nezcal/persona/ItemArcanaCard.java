package nezcal.persona;


import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by nezcal on 4/19/2017 at 11:43 PM.
 */
public class ItemArcanaCard extends Item {
    public ItemArcanaCard() {
        setRegistryName("itemArcanaCard");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName(main.MODID + ".itemArcanaCard");     // Used for localization (en_US.lang)
        GameRegistry.register(this);
    }
}
