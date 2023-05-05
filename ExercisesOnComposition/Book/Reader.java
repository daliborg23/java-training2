package Book;

import java.util.ArrayList;
import java.util.Date;

public class Reader {
    private String firstName;
    private String lastName;
    private ArrayList<Book> myBooks;
    private Date dateOfBirth;

        //region properties
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public ArrayList<Book> getMyBooks() {
        return myBooks;
    }
    public void setMyBooks(ArrayList<Book> myBooks) {
        this.myBooks = myBooks;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
        //endregion
        //region ctor
    public Reader() {
    }
    public Reader(String firstName, String lastName, ArrayList<Book> myBooks, Date dateOfBirth) {
        setFirstName(firstName);
        setLastName(lastName);
        setMyBooks(myBooks);
        setDateOfBirth(dateOfBirth);
    }
        //endregion

    public void borrowBook(Book book) {
        // if kniha available==true, nastavi na false a prida do myBooks
        if (book.getAvailable()) {
            getMyBooks().add(book);
            book.setAvailable(false);
        } else {
            System.out.println(String.format("Kniha neni dostupna. %s - %s",book.getAuthor(),book.getTitle()));
        }
    }
    public void returnBook(Book book) {
        if (!book.getAvailable() && getMyBooks().contains(book)) {
            getMyBooks().remove(book);
            book.setAvailable(true);
        }
        else {
            System.out.println(String.format("Nemuzes nam vratit neco co nemas. %s - %s",book.getAuthor(),book.getTitle()));
        }
    }
    public void listBorrowed() {
        if (getMyBooks().size() > 0) {
            System.out.println(String.format("  %s %s si pujcil tyhle knihy:",getFirstName(),getLastName()));
            for (Book book : getMyBooks()) {
                System.out.println(String.format(" %20s - %23s",book.getAuthor(),book.getTitle()));
            }
        } else {
            System.out.println(String.format("%s %s si nepujcil zadnou knihu.",getFirstName(),getLastName()));
        }
    }

}
