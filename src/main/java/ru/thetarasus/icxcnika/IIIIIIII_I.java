package ru.thetarasus.icxcnika;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.network.MessageType;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.LiteralText;
import ru.thetarasus.icxcnika.iiiiiiIIIIIIIIIII.IIII;
import ru.thetarasus.icxcnika.iiiiiiIIIIIIIIIII.IIIIIIIII;

import java.util.UUID;

public class IIIIIIII_I implements Command<ServerCommandSource> {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, boolean dedicated){
        dispatcher.register(CommandManager.literal("holyban").then(CommandManager.literal("name").then(CommandManager.argument("username", StringArgumentType.string()).executes(new IIIIIIII_I()))));
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
        IIIIIIIII player = IIII.IiIiiiiIiIII(IIII.IIIIiiii,  StringArgumentType.getString(ctx, "username"));
        if(player == null) {
            ctx.getSource().sendFeedback(new LiteralText("§сИгрок не найден!"), false);
            return 1;
        }
        IIII.IiIIiIIIIi.add(player);

        String text = "§e" + player.Iii + "§c is now banned! He will never get back from oblivion!";
        ctx.getSource().getMinecraftServer().getPlayerManager().broadcastChatMessage(new LiteralText(text), MessageType.CHAT, new UUID(0L, 0L));

        ctx.getSource().getMinecraftServer().getPlayerManager().getPlayer(player.Iii).networkHandler.disconnect(new LiteralText("§4THE WICKED SHOULD PERISH!"));
        return 1;
    }
}
