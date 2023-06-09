package Book;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Author a1 = new Author("Karel", "Jaromir", "Erben", new Date(11 / 7 / 1811));
        Book b1_1 = new Book("Kytice", a1, 350, 299.50);
        Book b1_2 = new Book("Vecer", a1, 400, 322.00);
        Book b1_3 = new Book("Na hrbitove", a1, 380, 310.50);
        Author a2 = new Author("Jaroslav", "Foglar", new Date(7 / 6 / 1907));
        Book b2_1 = new Book("Hosi od Bobri reky", a2, 450, 380.00);
        Book b2_2 = new Book("Zahada hlavolamu", a2, 280, 380.00);
        Book b2_3 = new Book("Stinadla se bouri", a2, 500, 505.00);
        Book b2_4 = new Book("Tajemstvi Velkeho Vonta", a2, 420, 450.00);
        Author a3 = new Author("Franz", "Kafka", new Date(7 / 3 / 1883));
        Book b3_1 = new Book("Promena", a3, 420, 420.42);
        Book b3_2 = new Book("Strazce hrobky", a3, 280, 199.99);
        Book b3_3 = new Book("Vsedni zmatek", a3, 333, 362.50);
        Author a4 = new Author("Karel", "Capek", new Date(1 / 9 / 1890));
        Book b4_1 = new Book("R.U.R.",a4,420,420.00);
        Book b4_2 = new Book("Tovarna na absolutno",a4,420,420.00);
        Book b4_3 = new Book("Valka s Mloky", a4, 420, 420.00);
        Book b4_4 = new Book("Bila nemoc", a4, 420, 420.00);
        Book b5_1 = new Book("1984", new Author("George", "Orwell", new Date(06 / 25 / 1903)),666,198.40);
        Book b5_2 = new Book("Farma zvirat", b5_1.getAuthor(), 350, 350.00);
        Book b5_3 = new Book("Barmske dny", b5_1.getAuthor(), 400, 400.00);

        Library library1 = new Library();
        //library1.Books = new List<Book> { b1_1, b1_2, b1_3, b2_1, b2_2, b2_3, b2_4, b3_1, b3_2, b3_3, b4_1, b4_2, b4_3, b4_4, b5_1, b5_2, b5_3 }; // 2. varianta
        library1.addBook(b1_1);
        library1.addBook(b1_2);
        library1.addBook(b1_3);
        library1.addBook(b2_1);
        library1.addBook(b2_2);
        library1.addBook(b2_3);
        library1.addBook(b2_4);
        library1.addBook(b3_1);
        library1.addBook(b3_2);
        library1.addBook(b3_3);
        library1.addBook(b4_1);
        library1.addBook(b4_2);
        library1.addBook(b4_3);
        library1.addBook(b4_4);
        library1.addBook(b5_1);
        library1.addBook(b5_2);
        library1.addBook(b5_3);

        // Vypis nove zrizene knihovny
        System.out.println("=========================================ZRIZENA=KNIHOVNA========================================");
        library1.listAll();
        System.out.println();
        library1.listAvailable();
        System.out.println();
        library1.listUnavailable();
        System.out.println();

        // Vytvoreni ctenare
        System.out.println("=================================VYTVOREN=CTENAR=A=PUJCIL=SI=3=KNIZKY============================");
        Reader reader = new Reader("Karel","Ctekniha",new ArrayList<Book>(),new Date(1/1/1990));
        reader.borrowBook(b1_1);
        reader.borrowBook(b1_2);
        reader.borrowBook(b1_3);

        // Vypis po vypujceni (knihovna)
        library1.listAll();
        System.out.println();
        library1.listAvailable();
        System.out.println();
        library1.listUnavailable();
        System.out.println();
        System.out.println();
        // Vypis pujcenych knih ctenare
        reader.listBorrowed();
        System.out.println();

        System.out.println("========================================VRACENI=3=PUJCENYCH=KNIH=================================");
        reader.returnBook(b1_1);
        reader.returnBook(b1_2);
        reader.returnBook(b1_3);

        // Vypis po vypujceni
        library1.listAll();
        System.out.println();
        library1.listAvailable();
        System.out.println();
        library1.listUnavailable();
        System.out.println();

        // Dalsi ctenar
        System.out.println("==========================VYTVOREN=DALSI=CTENAR=A=PUJCIL=SI=11=KNIZEK============================");
        Reader reader2 = new Reader("Ayem", "Readinbooks", new ArrayList<Book>(), new Date(1 / 1 / 1990));
        reader2.borrowBook(b2_1);
        reader2.borrowBook(b2_2);
        reader2.borrowBook(b2_3);
        reader2.borrowBook(b2_4);
        reader2.borrowBook(b3_1);
        reader2.borrowBook(b3_2);
        reader2.borrowBook(b3_3);
        reader2.borrowBook(b4_1);
        reader2.borrowBook(b4_2);
        reader2.borrowBook(b4_3);
        reader2.borrowBook(b4_4);

        // Vypis po vypujceni
        library1.listAll();
        System.out.println();
        library1.listAvailable();
        System.out.println();
        library1.listUnavailable();
        System.out.println();

        System.out.println("=============================VYTVOREN=HLADOVY=CTENAR=A=VYPUJCIL=VSE==============================");
        Reader reader3 = new Reader("John", "Varijot", new ArrayList<Book>(), new Date(1 / 1 / 1990));
        reader3.borrowBook(b1_1);
        reader3.borrowBook(b1_2);
        reader3.borrowBook(b1_3);
        reader3.borrowBook(b2_1);
        reader3.borrowBook(b2_2);
        reader3.borrowBook(b2_3);
        reader3.borrowBook(b2_4);
        reader3.borrowBook(b3_1);
        reader3.borrowBook(b3_2);
        reader3.borrowBook(b3_3);
        reader3.borrowBook(b4_1);
        reader3.borrowBook(b4_2);
        reader3.borrowBook(b4_3);
        reader3.borrowBook(b4_4);
        reader3.borrowBook(b5_1);
        reader3.borrowBook(b5_2);
        reader3.borrowBook(b5_3);

        // Vypis po vypujceni
        library1.listAll();
        System.out.println();
        library1.listAvailable();
        System.out.println();
        library1.listUnavailable();
        System.out.println();

        System.out.println("Zkouska");
        // Zkouska pujceni knihy ktera uz je pujcena
        reader.borrowBook(b2_1);
        // Zkouska vraceni knihy, kterou ci pujcil nekdo jiny
        reader.returnBook(b2_1);

        reader.listBorrowed();
    }
}
