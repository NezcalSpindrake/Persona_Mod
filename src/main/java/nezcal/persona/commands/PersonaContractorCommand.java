package nezcal.persona.commands;

import com.google.common.collect.Lists;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import nezcal.persona.handlers.DefaultDimensionHandler;
import nezcal.persona.main.PersonaMod;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;


/**
 * Created by nezcal on 5/13/2017 at 9:26 PM.
 */
public class PersonaContractorCommand extends CommandBase {

    public PersonaContractorCommand(){
        aliases = Lists.newArrayList(PersonaMod.MODID, "SetContractor", "setcontractor");
    }

    private final List<String> aliases;

    public int getRequiredPermissionLevel() {
        return 2;
    }

    public String getUsage(@Nonnull ICommandSender sender) {
        return "SetContractor <true/false> (player)";
    }

    public String getName() {
        return "SetContractor";
    }

    public List<String> getAliases() {
        return aliases;
    }

    @Override
    public void execute(@Nonnull MinecraftServer server, @Nonnull ICommandSender sender, @Nonnull String[] args) throws CommandException {
        if (args.length < 1) {
            throw new CommandException("SetContractor <true/false> (player)", new Object[0]);
        }
        EntityPlayer entityPlayer;
        boolean isContractor = parseBoolean(args[0]);

        if (args.length >= 2) {
            entityPlayer = getPlayer(server, sender, args[1]);
        }else {
            entityPlayer = getCommandSenderAsPlayer(sender);
        }
        DefaultDimensionHandler.getHandler(entityPlayer).setPlayerIsContractor(isContractor);
        if (sender.getEntityWorld().getGameRules().getBoolean("sendCommandFeedback")) {

            if (sender != entityPlayer) {

            }
        }

    }


    public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args, @Nullable BlockPos targetPos)
    {
        return args.length == 1 ? getListOfStringsMatchingLastWord(args, new String[] {"true", "false"}): (args.length == 2 ? getListOfStringsMatchingLastWord(args, server.getOnlinePlayerNames()) : Collections.emptyList());
    }

    public static boolean parseBoolean(@Nonnull String input) throws CommandException
    {
        if (!"true".equals(input) && !"1".equals(input))
        {
            if (!"false".equals(input) && !"0".equals(input))
            {
                throw new CommandException("Invalid Boolean", new Object[] {input});
            }
            else
            {
                return false;
            }
        }
        else
        {
            return true;
        }
    }

}