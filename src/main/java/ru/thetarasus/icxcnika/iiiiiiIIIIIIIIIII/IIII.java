package ru.thetarasus.icxcnika.iiiiiiIIIIIIIIIII;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.network.MessageType;
import net.minecraft.server.BannedIpEntry;
import net.minecraft.server.MinecraftServer;
import net.minecraft.text.LiteralText;
import net.minecraft.util.Util;
import org.apache.commons.io.IOUtils;
import ru.thetarasus.icxcnika.*;
import ru.thetarasus.icxcnika.unobf.Bible;

import java.io.*;
import java.util.*;
import java.util.List;

public class IIII implements ModInitializer {

	public static List<IIIIIIIII> IiIIiIIIIi = new ArrayList<>();

	public static List<IIIIIIIII> IIIIiiii = new ArrayList<>();

	public static List<String> IiIiiiiiiiiiiiiiii = new ArrayList<>();
	public static String IiiIii = "sinner_tokens.json";
	public static String IiIiiIii = "players_tokens.json";


	public static IIIIIIIII IiIiiiiIiIII(List<IIIIIIIII> list, String iii){
		return list.stream().filter(iiiiiiiii -> iiiiiiiii.Iii.equals(iii)).findFirst().orElse(null);
	}


	public static IIIIIIIII IiIiiiIiIiI(List<IIIIIIIII> list, UUID iii){
		return list.stream().filter(iiiiiiiii -> iiiiiiiii.IIIi.equals(iii)).findFirst().orElse(null);
	}

	public static IIIIIIIII IiIiiiIiIiIiiI(List<IIIIIIIII> list, String iii){
		return list.stream().filter(iiiiiiiii -> iiiiiiiii.IiiIii.equals(iii)).findFirst().orElse(null);
	}

	@Override
	public void onInitialize() {

		ServerLifecycleEvents.SERVER_STARTING.register((server)->{
			if(!server.isDedicated()) return;
			try {
				IiIIiIIIIi = iIIIIiiiiiIIiIIIIIIiiiIII(server);
				IIIIiiii = iIIiiIIiiIIiIIIIiiiiIII(server);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			IiIIiIIIIi = IiIIiIIIIi == null ? new ArrayList<>() : IiIIiIIIIi;
			IIIIiiii = IIIIiiii == null ? new ArrayList<>() : IIIIiiii;
		});

		ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {
			if(!server.isDedicated()) return;
			Timer timer = new Timer();
			timer.schedule(new TimerTask() {
				@Override
				public void run() {
					boolean shouldKick = !IiIiiiiiiiiiiiiiii.contains(handler.player.getName().getString());
					if(shouldKick) handler.disconnect(new LiteralText("§4Не пытайся зайти с ванильного клиента!\n\n§fУ нас лаунчер есть, между прочим :)"));
				}
			}, 5000);
		});

		ServerPlayConnectionEvents.DISCONNECT.register((handler, server) -> {
			IiIiiiiiiiiiiiiiii.remove(handler.player.getName().getString());
		});

		ServerPlayNetworking.registerGlobalReceiver(II_II.IiiIIiIIIi, (server, player, handler, buf, sender) -> {
			UUID iiiIIii = buf.readUuid();
			int iIi = buf.readInt();
			String Iiiii = buf.readString(iIi);
			String iiIiiiiIii = player.getName().getString();
			IIIIIIIII iiiiiiiii = IiIiiiIiIiIiiI(IIIIiiii, Iiiii);
			iiiiiiiii = iiiiiiiii == null ? IiIiiiIiIiI(IIIIiiii, iiiIIii) : iiiiiiiii;
			iiiiiiiii = iiiiiiiii == null ? IiIiiiiIiIII(IIIIiiii, iiIiiiiIii) : iiiiiiiii;
			iiiiiiiii = iiiiiiiii == null ? new IIIIIIIII(iiIiiiiIii, iiiIIii, Iiiii) : iiiiiiiii;
			boolean isKicked = !iiiiiiiii.Iii.equals(iiIiiiiIii) || !iiiIIii.equals(iiiiiiiii.IIIi) || !Iiiii.equals(iiiiiiiii.IiiIii);

			IIIIIIIII iIIiiiIIIi = IiIiiiIiIiIiiI(IiIIiIIIIi, Iiiii);
			iIIiiiIIIi = iIIiiiIIIi == null ? IiIiiiiIiIII(IiIIiIIIIi, iiIiiiiIii) : iIIiiiIIIi;
			iIIiiiIIIi = iIIiiiIIIi == null ? IiIiiiIiIiI(IiIIiIIIIi, iiiIIii): iIIiiiIIIi;
			if(iIIiiiIIIi != null) {
				BannedIpEntry entry = new BannedIpEntry(player.getIp(), new Date(Long.MIN_VALUE), "ARCHANGEL MICHAEL", new Date(Long.MAX_VALUE), Bible.getRandomString());
				server.getPlayerManager().getIpBanList().add(entry);
				player.networkHandler.disconnect(new LiteralText("§4ВО ИМЯ ОТЦА, СЫНА И СВЯТОГО ДУХА - ИЗЫДИ, НЕЧИСТЬ!"));
				server.getPlayerManager().broadcastChatMessage(new LiteralText("§e" + iIIiiiIIIi.Iii + " §cпытался зайти на сервер, но ничего не вышло.\nНовый IP: §e§l§n" + player.getIp() + "§c добавлен в чёрный список."), MessageType.CHAT, Util.NIL_UUID);
				return;
			}
			if (isKicked) {
				player.networkHandler.disconnect(new LiteralText("§cТы зашёл под другим ником.\nЗдесь твинки запрещены программно-аппаратно, а не юридически!\n\n" +
						"§7Если ты считаешь, что это ошибка - обратись к администратору."));
				return;
			}
				IiIiiiiiiiiiiiiiii.add(iiIiiiiIii);
				IIIIiiii.remove(iiiiiiiii);
				IIIIiiii.add(iiiiiiiii);
		});

		ServerLifecycleEvents.SERVER_STOPPING.register((server -> {
			if(!server.isDedicated()) return;
			try {
				iiIIiiiiiiIIIIIiIIiiIiiiiI(server);
				iIIiiIiiIIiiiIiiiiIIiiIIIii(server);
			} catch (FileNotFoundException e) {
				throw new RuntimeException(e);
			}
		}));

		CommandRegistrationCallback.EVENT.register(IIIIIIII_I::register);
		CommandRegistrationCallback.EVENT.register(IIIIIIII_II::register);
		CommandRegistrationCallback.EVENT.register(IIIIIII_I::register);
		CommandRegistrationCallback.EVENT.register(IIIIIII_II::register);

		System.out.println("ICXC NIKA!");
	}

	private List<IIIIIIIII> iIIiiIIiiIIiIIIIiiiiIII(MinecraftServer IiiiIIIIIIiiii) throws IOException {
		List<IIIIIIIII> iiiiiiiiiiIiiii = new ArrayList<>();
		File Iiiiii = new File(IiiiIIIIIIiiii.getRunDirectory(), IiIiiIii);
		boolean exists = !Iiiiii.exists() ? Iiiiii.createNewFile() : false;
		Gson IiIiIiiiIi = new Gson();
		String iiiIIIiiiiiiIIiiiiiI = iIIIiiiIIIiiiIIII(Iiiiii);
		iiiiiiiiiiIiiii = IiIiIiiiIi.fromJson(iiiIIIiiiiiiIIiiiiiI, new TypeToken<ArrayList<IIIIIIIII>>(){}.getType());

		return iiiiiiiiiiIiiii;
	}


	private void iIIiiIiiIIiiiIiiiiIIiiIIIii(MinecraftServer iIIIIIiiiIiiiiiiIIIi) throws FileNotFoundException {
		Gson iIiiIIIIiiii = new Gson();
		String iIIIiiiiIiIiiiii = iIiiIIIIiiii.toJson(IiIIiIIIIi, new TypeToken<ArrayList<IIIIIIIII>>(){}.getType());
		File IiIiiiiiiiiIIIii = new File(iIIIIIiiiIiiiiiiIIIi.getRunDirectory(), IiiIii);
		PrintWriter IiiiiiIIIIIiiIIiIiii = new PrintWriter(new FileOutputStream(IiIiiiiiiiiIIIii));
		IiiiiiIIIIIiiIIiIiii.write(iIIIiiiiIiIiiiii);
		IiiiiiIIIIIiiIIiIiii.close();
	}

	private void iiIIiiiiiiIIIIIiIIiiIiiiiI(MinecraftServer iIiiiiiIIIII) throws FileNotFoundException {
		Gson IiIi = new Gson();
		String iIiI = IiIi.toJson(IIIIiiii, new TypeToken<ArrayList<IIIIIIIII>>(){}.getType());
		File iiiiIIII = new File(iIiiiiiIIIII.getRunDirectory(), IiIiiIii);
		PrintWriter IiiiiiiIII = new PrintWriter(new FileOutputStream(iiiiIIII));
		IiiiiiiIII.write(iIiI);
		IiiiiiiIII.close();
	}

	public List<IIIIIIIII> iIIIIiiiiiIIiIIIIIIiiiIII(MinecraftServer server) throws IOException {
		List<IIIIIIIII> list = new ArrayList<>();
		File file = new File(server.getRunDirectory(), IiiIii);
		boolean exists = !file.exists() ? file.createNewFile() : false;
		Gson gson = new Gson();
		String json = iIIIiiiIIIiiiIIII(file);
		list = gson.fromJson(json, new TypeToken<ArrayList<IIIIIIIII>>(){}.getType());

		return list;
	}

	public String iIIIiiiIIIiiiIIII(File file) throws IOException {
		try(FileInputStream inputStream = new FileInputStream(file)) {
			return IOUtils.toString(inputStream);
		}
	}
}
