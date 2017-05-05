package nezcal.persona.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;
import nezcal.persona.main.PersonaMod;

/**
 * Created by nezcal on 5/5/2017 at 11:48 AM.
 */
public class PersonaBlock extends Block {

    public final String blockName;

    public PersonaBlock(String name, Material mat, SoundType sound, float hardness, float resistance){
        super(mat);
        this.setSoundType(sound);
        setHardness(hardness);
        setResistance(resistance);

        setUnlocalizedName(PersonaMod.MODID + "." + name);
        setRegistryName(name);
        setCreativeTab(PersonaMod.creativeTab);

        GameRegistry.register(this);

        this.blockName = name;
    }


}
