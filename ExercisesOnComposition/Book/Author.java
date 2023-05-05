package Book;

import java.util.ArrayList;
import java.util.Date;

public class Author {
    private String firstName;
    private String middleName;
    private String lastName;
    private Date dateOfBirth;
    private ArrayList<Book> books;

        //region gettersSetters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
        //endregion
        //region ctor
    public Author(String firstName, String lastName, Date dateOfBirth) {
        setFirstName(firstName);
        setLastName(lastName);
        setDateOfBirth(dateOfBirth);
        setBooks(new ArrayList<Book>());
    }
    public Author(String firstName, String middlename, String lastName, Date dateOfBirth) {
        setFirstName(firstName);
        setMiddleName(middlename);
        setLastName(lastName);
        setDateOfBirth(dateOfBirth);
        setBooks(new ArrayList<Book>());
    }
        //endregion
    public void listBooks() { // vypise knihy autora

    }
    @Override
    public String toString() {
        //return $"{FirstName} {(MiddleName == null ? String.Empty : MiddleName)} {LastName}";
        if (getMiddleName() == null) {
            return String.format("%s %s",getFirstName(),getLastName());
        } else {
            return String.format("%s %s %s",getFirstName(),getMiddleName(),getLastName());
        }
    }

}
