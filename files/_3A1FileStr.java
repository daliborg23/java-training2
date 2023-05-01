import java.nio.CharBuffer;
import java.util.*;
import java.io.*;
import java.lang.*;

public class _3A1FileStr {
    public static void Mainx() {
        int dny;
        int hodiny;
        int sekundy;
        dny = 0;
        hodiny = 0;
        sekundy = 0;
        String cesta = "C:\\Kurs\\soubor7.txt"; // "5 dni 7 hodin"  "][[-;]\';./'/'\+_=-"
        String cesta2 = "C:\\Kurs\\soubor8.txt";

        // nacteni souboru do listu
        File fi = new File(cesta);
        List<String> lines = new ArrayList<String>();
        String line = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(cesta));
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                lines.add(line);
            }
            dny = Integer.parseInt(lines.get(0));
            hodiny = Integer.parseInt(lines.get(1));
            //sekundy = Integer.parseInt(lines.get(2)); // cteni za koncem souboru?
            reader.close();
        } catch (IOException e) {
            System.out.println("Neco se souborem.\n" + e.getMessage() + "\n" + e.getStackTrace());
        } catch (NumberFormatException e) {
            System.out.println("Spatne zadane hodnoty. ");
            //throw;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Pokus o cteni tretiho radku ktery neni.");
        } catch (RuntimeException e) {
            System.out.println("Nejaka dalsi vyjimka?\n" + e.getMessage() + "\n" + e.getStackTrace());
        }

        // vystup do dalsiho souboru
        try {
            BufferedWriter output = new BufferedWriter(new FileWriter(cesta2, true));
            //FileWriter myWriter = new FileWriter(cesta2);
            output.write((dny + " dnu a " + hodiny + " hodiny je " + ((dny * 24) + hodiny) + " hodin") + System.lineSeparator());
            output.close(); // kdyz nezavru, tak se soubor neulozi.
            System.out.println("Successfully wrote to the file.");
            System.out.printf("%1$s dnu a %2$s hodiny je %3$s hodin" + "\r\n", dny, hodiny, ((dny * 24) + hodiny));
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
