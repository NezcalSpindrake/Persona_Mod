package nezcal.persona;


import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by nezcal on 4/19/2017 at 11:47 PM.
 */
public class ModItems {

    public static ItemArcanaCard arcanaCard;

    public static void init() {
        arcanaCard = new ItemArcanaCard();
    }


    public static void initModels() {
        arcanaCard.initModel();
    }
}
