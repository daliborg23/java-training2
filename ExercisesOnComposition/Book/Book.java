package Book;

public class Book {
    private String title;
    private Author author;
    private int pages;
    private double price;
    private boolean available;

        //region gettersSetters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

        //endregion
        //region ctor
    public Book(String title, Author author, int pages, double price) {
        setTitle(title);
        setAuthor(author);
        setPages(pages);
        setPrice(price);
        setAvailable(true);
    }
        //endregion
    @Override
    public String toString() {
        return String.format("| %19s - %23s | Pages: %3s | Price: %3.2f,- | Available: " + (getAvailable() == true ? "Yes " : "No  ") + "|",getAuthor(),getTitle(),getPages(),getPrice());
    }

}
