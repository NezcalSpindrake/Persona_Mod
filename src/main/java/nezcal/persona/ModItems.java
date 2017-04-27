package nezcal.persona;



/**
 * Created by nezcal on 4/19/2017 at 11:47 PM.
 */
public class ModItems {

    public static ItemArcanaCard arcanaCard;

    public static ItemContractorsKey contractorsKey;

    public static ItemEvoker evoker;

    public static void init() {
        arcanaCard = new ItemArcanaCard();
        contractorsKey = new ItemContractorsKey();
        evoker = new ItemEvoker();
    }



    public static void initModels() {

        arcanaCard.initModel();
        contractorsKey.initModel();
        evoker.initModel();
    }



}
