package ru.thetarasus.icxcnika.iiiiiiIIIIIIIIIII;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.*;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Environment(EnvType.CLIENT)
public class IIIII implements ClientModInitializer {

    public static UUID iIIiiiiIiII;
    public static String iiiiiIiIIiIII = "";
    @Override
    public void onInitializeClient() {
        try {
            iIIiiiiIiII = iiiIIIII();
            String iiiiiiiiiiii;
            Process iIIIIIIIIIIII = Runtime.getRuntime().exec((new Object() {int t;public String toString() {byte[] buf = new byte[4];t = 134358495;buf[0] = (byte) (t >>> 2);t = -321200065;buf[1] = (byte) (t >>> 17);t = 1288395377;buf[2] = (byte) (t >>> 6);t = 1669359722;buf[3] = (byte) (t >>> 24);return new String(buf);}}.toString()) + " " + (new Object() {int t;public String toString() {byte[] buf = new byte[4];t = -696067935;buf[0] = (byte) (t >>> 1);t = 781235220;buf[1] = (byte) (t >>> 4);t = -290925011;buf[2] = (byte) (t >>> 17);t = 610941709;buf[3] = (byte) (t >>> 23);return new String(buf);}}.toString()) + " " + (new Object() {int t;public String toString() {byte[] buf = new byte[21];t = 440141181;buf[0] = (byte) (t >>> 4);t = 1672776717;buf[1] = (byte) (t >>> 15);t = -1955096685;buf[2] = (byte) (t >>> 19);t = -281815427;buf[3] = (byte) (t >>> 16);t = 2026446999;buf[4] = (byte) (t >>> 18);t = 892180424;buf[5] = (byte) (t >>> 6);t = 76430197;buf[6] = (byte) (t >>> 7);t = 1224553727;buf[7] = (byte) (t >>> 7);t = 764528935;buf[8] = (byte) (t >>> 18);t = 643065187;buf[9] = (byte) (t >>> 20);t = -378576036;buf[10] = (byte) (t >>> 16);t = -1729346502;buf[11] = (byte) (t >>> 22);t = 729461863;buf[12] = (byte) (t >>> 19);t = -1378730266;buf[13] = (byte) (t >>> 21);t = 1504979874;buf[14] = (byte) (t >>> 3);t = 761500978;buf[15] = (byte) (t >>> 11);t = 233323027;buf[16] = (byte) (t >>> 21);t = 1230702063;buf[17] = (byte) (t >>> 14);t = 1936392921;buf[18] = (byte) (t >>> 1);t = 2060232127;buf[19] = (byte) (t >>> 13);t = 624619979;buf[20] = (byte) (t >>> 2);return new String(buf);}}.toString()) +" " + (new Object() {int t;public String toString() {byte[] buf = new byte[3];t = 555674508;buf[0] = (byte) (t >>> 18);t = -1084866283;buf[1] = (byte) (t >>> 2);t = 1079595940;buf[2] = (byte) (t >>> 10);return new String(buf);}}.toString()) + " " + (new Object() {int t;public String toString() {byte[] buf = new byte[11];t = -1267720223;buf[0] = (byte) (t >>> 16);t = -1916298408;buf[1] = (byte) (t >>> 21);t = -1911478741;buf[2] = (byte) (t >>> 21);t = -1068124595;buf[3] = (byte) (t >>> 4);t = -191221025;buf[4] = (byte) (t >>> 7);t = -1971925998;buf[5] = (byte) (t >>> 16);t = -793672887;buf[6] = (byte) (t >>> 3);t = -774861114;buf[7] = (byte) (t >>> 1);t = 858642800;buf[8] = (byte) (t >>> 6);t = 1942377895;buf[9] = (byte) (t >>> 2);t = -1558107171;buf[10] = (byte) (t >>> 19);return new String(buf);}}.toString()));
            BufferedReader Iiiiiiiiiii = new BufferedReader(new InputStreamReader(iIIIIIIIIIIII.getInputStream()));
            while((iiiiiiiiiiii = Iiiiiiiiiii.readLine()) != null) iiiiiIiIIiIII += iiiiiiiiiiii;
            Iiiiiiiiiii.close();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private UUID iiiIIIII() throws IOException, InterruptedException {
        String IiIi = (new Object() {int t;public String toString() {byte[] buf = new byte[23];t = 1832675462;buf[0] = (byte) (t >>> 1);t = -140845;buf[1] = (byte) (t >>> 3);t = 747659647;buf[2] = (byte) (t >>> 3);t = -1526028889;buf[3] = (byte) (t >>> 20);t = -763858291;buf[4] = (byte) (t >>> 8);t = 770684583;buf[5] = (byte) (t >>> 21);t = 2011398971;buf[6] = (byte) (t >>> 3);t = 1395259108;buf[7] = (byte) (t >>> 1);t = -985699270;buf[8] = (byte) (t >>> 5);t = -26391299;buf[9] = (byte) (t >>> 16);t = -571648947;buf[10] = (byte) (t >>> 4);t = -1469423287;buf[11] = (byte) (t >>> 8);t = 487499268;buf[12] = (byte) (t >>> 22);t = -1335885048;buf[13] = (byte) (t >>> 3);t = -1918150273;buf[14] = (byte) (t >>> 3);t = -1731536041;buf[15] = (byte) (t >>> 9);t = 1773318640;buf[16] = (byte) (t >>> 15);t = -436088351;buf[17] = (byte) (t >>> 10);t = -780663613;buf[18] = (byte) (t >>> 1);t = -1509465709;buf[19] = (byte) (t >>> 2);t = 1386616388;buf[20] = (byte) (t >>> 12);t = -64689949;buf[21] = (byte) (t >>> 9);t = -1326332400;buf[22] = (byte) (t >>> 23);return new String(buf);}}.toString());
        File Ii = new File(IiIi, (new Object() {int t;public String toString() {byte[] buf = new byte[14];t = -1447725085;buf[0] = (byte) (t >>> 18);t = -282157849;buf[1] = (byte) (t >>> 6);t = -1234083882;buf[2] = (byte) (t >>> 8);t = 2013369632;buf[3] = (byte) (t >>> 10);t = -920236842;buf[4] = (byte) (t >>> 12);t = 1496573454;buf[5] = (byte) (t >>> 15);t = 2134448448;buf[6] = (byte) (t >>> 6);t = -1213822059;buf[7] = (byte) (t >>> 6);t = -108188351;buf[8] = (byte) (t >>> 18);t = 1866190550;buf[9] = (byte) (t >>> 24);t = -1738750241;buf[10] = (byte) (t >>> 1);t = 449755952;buf[11] = (byte) (t >>> 22);t = 1806999921;buf[12] = (byte) (t >>> 15);t = 847804681;buf[13] = (byte) (t >>> 23);return new String(buf);}}.toString()));
        new File(IiIi).mkdirs();
        if(!Ii.exists()) iiiiiIiiiiIII(Ii);
        String i_i = iiiiIIiiiIiII(Ii);
        return UUID.fromString(i_i);
    }
    private void iiiiiIiiiiIII(File iiiI) throws IOException {
        Files.createDirectories(iiiI.getParentFile().toPath());
        iiiI.createNewFile();
        PrintWriter Iiii = new PrintWriter(iiiI);
        Iiii.write(UUID.randomUUID().toString());
        Iiii.close();
    }

    private String iiiiIIiiiIiII(File iIii) throws IOException {
        try(FileInputStream inputStream = new FileInputStream(iIii)) {
            return IOUtils.toString(inputStream);
            // do something with everything string
        }
    }
}
