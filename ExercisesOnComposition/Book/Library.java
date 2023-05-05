package Book;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
        //region properties
    public ArrayList<Book> getBooks() {
        return books;
    }
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
        //endregion
        //region ctor
    public Library() {
        setBooks(new ArrayList<Book>());
    }
    public Library(ArrayList<Book> seznamPredem){
        setBooks(seznamPredem);
    }
        //endregion

    public void addBook(Book book) {
        getBooks().add(book);
    }
    public void listAvailable() {
        System.out.println("---------------------------------------Seznam-dostupnych-knih------------------------------------");
        boolean empty = true;
        for (Book book : getBooks()) {
            if (book.getAvailable() == true) {
                System.out.println(book.toString());
                empty = false;
            }
        }
        if (empty == true) {
            System.out.println("                                       Neni dostupna zadna kniha.");
        }
        System.out.println("-------------------------------------------------------------------------------------------------");
    }
    public void listUnavailable() {
        System.out.println("--------------------------------------Seznam-vypujcenych-knih------------------------------------");
        boolean full = true;
        for (Book book : getBooks()) {
            if (book.getAvailable() == false) {
                System.out.println(book.toString());
                full = false;
            }
        }
        if (full == true) {
            System.out.println("                                       Nikdo si nic nepujcil.");
        }
        System.out.println("-------------------------------------------------------------------------------------------------");
    }
    public void listAll() {
        System.out.println("-----------------------------------------Seznam-vsech-knih---------------------------------------");
        for (Book book : getBooks())
        {
            System.out.println(book.toString());
        }
        System.out.println("-------------------------------------------------------------------------------------------------");
    }
}
