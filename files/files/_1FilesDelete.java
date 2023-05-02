package files;

import java.util.*;
import java.io.*;

public class _1FilesDelete {
    public static void Mainx() {
        String cesta = "C:\\Kurs\\";
        String soubor = "1Pokus.txt";
        File slozka = new File(cesta); // nova slozka
        File txtSoubor = new File(cesta + soubor); // novy pokusny soubor
        System.out.println("pathname: " + cesta + soubor);
        System.out.println(txtSoubor.exists());
        int count = 0;
        // kontrola slozky
        try {
            if (slozka.createNewFile()) {
                System.out.println("Folder created: " + slozka.getName());
            } else {
                System.out.println("Folder already exists. " + slozka.toString());
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        // kontrola souboru
        try {
            if (txtSoubor.createNewFile()) {
                System.out.println("File created: " + txtSoubor.getName());
            } else {
                System.out.println("File already exists. " + txtSoubor.getPath());
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        // vypsani souboru ve slozce
        if (slozka.exists()) {
            for (File file : slozka.listFiles()) {
                if (file.isFile()) {
                    count++;
                }
            }
            System.out.printf("Adresar %1$s ma %2$s souboru" + "\r\n", cesta, count);
            for (File file : slozka.listFiles()) {
                if (file.isFile()) {
                    System.out.println(file.getPath() + "\t" + file.length());
                }
            }
        } else {
            System.out.println("Zadana cesta " + cesta + " neexistuje.");
        }

        // reset pocitadla pro dalsi vypis
        count = 0;

        // dotaz na smazani souboru
        System.out.println("Ktery soubor smazat?");

        String KeSmazani = new Scanner(System.in).nextLine();
        File fiDelete = new File(cesta + KeSmazani);

        if ((new File(cesta + KeSmazani)).isFile()) {
            System.out.println("Opravdu chcete smazat soubor " + cesta + KeSmazani + "? y/n");
            String YesNo = new Scanner(System.in).nextLine();
            if (Objects.equals(YesNo, "y")) {
                fiDelete.delete();
                System.out.println("Soubor " + cesta + KeSmazani + " uspesne smazan.");
            } else if (Objects.equals(YesNo, "n")) {
                System.out.println("Tak nic.");
            } else {
                System.out.println("Otazka znela jestli chces smazat soubor a spravna odpoved je 'y' pro Ano nebo 'n' pro Ne...");
            }
        } else {
            System.out.println("Zadany soubor " + cesta + KeSmazani + " neexistuje.");
        }
        System.out.println();
        if (slozka.exists()) {
            for (File file : slozka.listFiles()) {
                if (file.isFile()) {
                    count++;
                }
            }
            System.out.printf("Adresar %1$s ma %2$s souboru" + "\r\n", cesta, count);
            for (File file : slozka.listFiles()) {
                if (file.isFile()) {
                    System.out.println(file.getPath() + "\t" + file.length());
                }
            }
        } else {
            System.out.println("Zadana cesta " + cesta + " neexistuje.");
        }
    }
}
