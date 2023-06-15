package ru.thetarasus.icxcnika;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.command.argument.UuidArgumentType;
import net.minecraft.network.MessageType;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.LiteralText;
import ru.thetarasus.icxcnika.iiiiiiIIIIIIIIIII.IIII;
import ru.thetarasus.icxcnika.iiiiiiIIIIIIIIIII.IIIIIIIII;

import java.util.UUID;

public class IIIIIII_II implements Command<ServerCommandSource> {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, boolean dedicated){
        dispatcher.register(CommandManager.literal("holypardon").then(CommandManager.literal("uuid").then(CommandManager.argument("token", UuidArgumentType.uuid()).executes(new IIIIIII_II()))));
    }

    @Override
    public int run(CommandContext<ServerCommandSource> ctx) throws CommandSyntaxException {
        ServerPlayerEntity playerEntity = ctx.getSource().getPlayer();
        if(!ctx.getSource().hasPermissionLevel(4)){
            ctx.getSource().sendFeedback(new LiteralText(
                    "⠀⠀⠀⠀⠀⣠⠂⠉⡩⣍⠏⢏⠯⣙⣛⣛⠦⢦⠤⡀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⢀⣔⡀⠀⢈⣭⣦⣦⠤⣁⠀⠀⣀⣤⣬⢀⢀⣄⠀⠀⠀\n" +
                            "⠀⠀⡎⡎⡖⣉⣭⣒⠒⠊⠀⣈⡁⠀⠀⢯⠀⠢⢊⠓⡏⡇⠀⠀\n" +
                            "⠀⠀⠉⢥⠁⠀⢳⠦⣯⣉⣒⡞⠤⣭⢴⣭⠤⡔⣟⣇⣰⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠙⡄⠀⠈⠳⣤⣽⠉⠉⣟⠛⡿⣿⣻⢿⠏⢳⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠉⠂⢭⣋⠒⢤⣭⠭⢽⣙⠿⠤⠂⡠⢠⠀⠀⠀\n"+
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠀⠒⠤⠤⠤⠤⠤⠐⠉⠀⠀⠀\nP R O B L E M S ?"), false);
            return 1;
        }

        IIIIIIIII player = IIII.IiIiiiIiIiI(IIII.IIIIiiii, UuidArgumentType.getUuid(ctx, "iIIiiiiIiII"));
        if(player == null) {
            ctx.getSource().sendFeedback(new LiteralText("§UUID не найден!"), false);
            return 1;
        }
        IIII.IiIIiIIIIi.removeIf(iiiiiiiii -> iiiiiiiii.IIIi.equals(player.IIIi) || iiiiiiiii.IiiIii.equals(player.IiiIii) || iiiiiiiii.Iii.equals(player.Iii));
        String text = "§e" + player.Iii + "§a has been released from depths of oblivion!";
        ctx.getSource().getMinecraftServer().getPlayerManager().broadcastChatMessage(new LiteralText(text), MessageType.CHAT, new UUID(0L, 0L));
        return 1;
    }
}
