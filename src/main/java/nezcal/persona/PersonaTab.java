package nezcal.persona;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/**
 * Created by nezcal on 4/21/2017 at 3:53 AM.
 */
public class PersonaTab extends CreativeTabs {

    public PersonaTab() {

        super(PersonaMod.MODID);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.arcanaCard);
    }
}
