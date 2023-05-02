package files;

import java.io.*;

public class _4A1FileByte
{
	public static void Mainx()
	{
		String cesta = "C:\\Kurs\\BinarniSouborJava.dat";
		byte[] poleProZapis = new byte[] {16, 7};
		byte[] poleProCteni = new byte[2];
		int cislo = 0;
		int ii = 0;
		int dny = 0;
		int hodiny = 0;

        // zapis
        try {
            OutputStream outputStream = new FileOutputStream(cesta);
            int byteRead = -1;
            System.out.println("Na zapsani:");
            while (ii != poleProZapis.length) {
                outputStream.write(poleProZapis[ii]);
                System.out.println(poleProZapis[ii]);
                ii++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        // vypis a doplneni do noveho pole
        try {
            InputStream inputStream = new FileInputStream(cesta);
            int byteRead = -1;
            ii = 0;
            System.out.println("Vypis:");
            while (ii != poleProZapis.length) {
                cislo = inputStream.read();
                if (cislo == -1)
                {
                    throw new IOException("Konec cteni souboru.");
                }
                poleProCteni[ii] = (byte)cislo;
                System.out.println(poleProZapis[ii]);
                ii++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        dny = poleProCteni[0];
        hodiny = poleProCteni[1];
        System.out.println(dny + " dnu a " + hodiny + " hodiny je " + ((dny * 24) + hodiny) + " hodin");
	}
}