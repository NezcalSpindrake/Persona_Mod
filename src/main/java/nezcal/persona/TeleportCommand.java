package nezcal.persona;

import com.google.common.collect.Lists;
import com.sun.istack.internal.Nullable;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import javax.annotation.Nonnull;
import java.util.Collections;
import java.util.List;


/**
 * Created by nezcal on 4/20/2017 at 9:23 AM.
 */
public class TeleportCommand extends CommandBase {
    public TeleportCommand(){
        aliases = Lists.newArrayList(main.MODID, "TP", "tp");
    }

    private final List<String> aliases;

    @Override
    @Nonnull
    public String getName() {
        return "tp";
    }

    @Override
    @Nonnull
    public String getUsage(@Nonnull ICommandSender sender) {
        return "tp <id>";
    }

    @Override
    @Nonnull
    public List<String> getAliases() {
        return aliases;
    }

    @Override
    public void execute(@Nonnull MinecraftServer server, @Nonnull ICommandSender sender, @Nonnull String[] args) throws CommandException {
        if (args.length < 1) {
            return;
        }
        String s = args[0];
        int dim;
        try {
            dim = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            sender.sendMessage(new TextComponentString(TextFormatting.RED + "Error parsing dimension!"));
            return;
        }

        if (sender instanceof EntityPlayer) {
            CustomTeleporter.teleportToDimension((EntityPlayer) sender, dim, 0, 100, 0);
        }
    }

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
        return true;
    }

    @Override
    @Nonnull
    public List<String> getTabCompletionOptions(MinecraftServer server, ICommandSender sender, String[] args, @Nullable BlockPos pos) {
        return Collections.emptyList();
    }
}
