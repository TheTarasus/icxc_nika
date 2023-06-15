package ru.thetarasus.icxcnika;

import io.netty.buffer.Unpooled;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.util.Identifier;

import java.util.UUID;

public class II_II {
    public static Identifier IiiIIiIIIi = new Identifier((new Object() {int t;public String toString() {byte[] buf = new byte[8];t = 379062931;buf[0] = (byte) (t >>> 20);t = -1483985722;buf[1] = (byte) (t >>> 2);t = 874867922;buf[2] = (byte) (t >>> 1);t = -553223796;buf[3] = (byte) (t >>> 3);t = -1009203647;buf[4] = (byte) (t >>> 10);t = 1546644785;buf[5] = (byte) (t >>> 5);t = 1882324734;buf[6] = (byte) (t >>> 16);t = -2119882478;buf[7] = (byte) (t >>> 18);return new String(buf);}}.toString()),(new Object() {int t;public String toString() {byte[] buf = new byte[9];t = -428658183;buf[0] = (byte) (t >>> 8);t = 104548801;buf[1] = (byte) (t >>> 11);t = -350923116;buf[2] = (byte) (t >>> 4);t = 443180312;buf[3] = (byte) (t >>> 22);t = -255349040;buf[4] = (byte) (t >>> 18);t = -750224895;buf[5] = (byte) (t >>> 19);t = -1968818159;buf[6] = (byte) (t >>> 13);t = -518471134;buf[7] = (byte) (t >>> 15);t = 161825245;buf[8] = (byte) (t >>> 18);return new String(buf);}}.toString()));
    public static Identifier iIiiiiIIiIiiiiIIIIIIIiii = new Identifier((new Object() {int t;public String toString() {byte[] buf = new byte[8];t = 610895490;buf[0] = (byte) (t >>> 16);t = -825877265;buf[1] = (byte) (t >>> 17);t = -957347447;buf[2] = (byte) (t >>> 17);t = -658063269;buf[3] = (byte) (t >>> 22);t = -689161489;buf[4] = (byte) (t >>> 20);t = 2040966315;buf[5] = (byte) (t >>> 18);t = 1023782051;buf[6] = (byte) (t >>> 10);t = 1175823378;buf[7] = (byte) (t >>> 20);return new String(buf);}}.toString()), (new Object() {int t;public String toString() {byte[] buf = new byte[6];t = -1312001433;buf[0] = (byte) (t >>> 18);t = -1486514991;buf[1] = (byte) (t >>> 16);t = -1154589638;buf[2] = (byte) (t >>> 13);t = 514750173;buf[3] = (byte) (t >>> 8);t = 1475372526;buf[4] = (byte) (t >>> 8);t = -296030063;buf[5] = (byte) (t >>> 21);return new String(buf);}}.toString()));

    public static void createC2SPacket(UUID uuid, int length, String hardtoken){
        PacketByteBuf buf = new PacketByteBuf(Unpooled.buffer());
        buf.writeUuid(uuid);
        buf.writeInt(length);
        buf.writeString(hardtoken);
        ClientPlayNetworking.send(IiiIIiIIIi, buf);
    }
}
