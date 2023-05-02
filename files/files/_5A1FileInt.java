// DataOutputStream
// DataInputStream
package files;

import java.io.*;

public class _5A1FileInt
{
    public static void Mainx()
    {
        String cesta = "C:\\Kurs\\BinarniSouborJavaInt.dat";
        int[] poleProZapis = new int[] {300, 300};
        int[] poleProCteni = new int[2];
        int cislo = 0;
        int ii = 0;
        int dny = 0;
        int hodiny = 0;

        // zapis
        try {
            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(cesta));
            int byteRead = -1;
            System.out.println("Na zapsani:");
            while (ii != poleProZapis.length) {
                outputStream.writeInt(poleProZapis[ii]);
                System.out.println(poleProZapis[ii]);
                ii++;
            }
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // vypis a doplneni do noveho pole
        try {
            ii = 0;
            DataInputStream inputStream = new DataInputStream(new FileInputStream(cesta));
            System.out.println("Vypis:");
            while (inputStream.available() > 0) {
                cislo = inputStream.readInt();
//                if (cislo == -1)
//                {
//                    throw new IOException("Konec cteni souboru.");
//                }
                poleProCteni[ii] = cislo;
                System.out.println(poleProZapis[ii]);
                ii++;
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        dny = poleProCteni[0];
        hodiny = poleProCteni[1];
        System.out.println(dny + " dnu a " + hodiny + " hodiny je " + ((dny * 24) + hodiny) + " hodin");
    }
}