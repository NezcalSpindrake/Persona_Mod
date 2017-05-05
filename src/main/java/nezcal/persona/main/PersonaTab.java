package nezcal.persona.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import nezcal.persona.item.ModItems;

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
