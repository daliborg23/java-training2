package files;

import java.util.*;
import java.io.*;

public class _2FileNotParse {
    public static void Mainx() {
        ArrayList<String> listText = new ArrayList<String>(Arrays.asList("Lorem ipsum dolor sit amet, consectetuer adipiscing elit.", "Integer malesuada. Donec iaculis gravida nulla.", "Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.", "Nunc auctor. Nullam lectus justo, vulputate eget mollis sed, tempor sed magna."));
        String cesta = "C:\\Kurs\\Soubor6.txt";
        // vytvoreni souboru
        File fileInfo = new File(cesta);
        try {
            if (fileInfo.createNewFile()) {
                System.out.println("File created: " + fileInfo.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        // zapsani do souboru
        try {
            FileWriter myWriter = new FileWriter(cesta);
            for (int i = 0; i < listText.size(); i++) {
                myWriter.write(listText.get(i));
                System.out.println(listText.get(i));
                myWriter.write("\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        // vypis ze souboru  1. varianta
        System.out.println("\nV souboru je napsano:");
        try {
            BufferedReader br = new BufferedReader(new FileReader(cesta));
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            //throw new FileNotFoundException("Soubor nenalezen");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // cteni ze souboru, scanner nejak nejede na radky... nutno zkusit znova
        /*if (fileInfo.exists()) {
            Scanner myReader = new Scanner(cesta);
            while (myReader.hasNextLine()) {
                System.out.println(myReader.nextLine());
            }
            myReader.close();
        } else {
            System.out.println("Cesta " + fileInfo.getPath() + " neexistuje.");
        }*/

    }
}
