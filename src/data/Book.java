package data;

public class Book {

    private String title, author, publisher;
    private int numPages, yearPublish;
    private long isbn;

    public Book(String title, String author, String publisher, int numPages, int yearPublish, long isbn) {
        this.title =  title;
        this.author = author ;
        this.publisher = publisher;
        this.numPages = numPages;
        this.yearPublish = yearPublish;
        this.isbn = isbn;
    }

    public Book(Book book)
    {
        this(book.getTitle(), book.getAuthor(), book.getPublisher(), book.getNumPages(), book.getYearPublish(), book.getIsbn());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public int getYearPublish() {
        return yearPublish;
    }

    public void setYearPublish(int yearPublish) {
        this.yearPublish = yearPublish;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public void showInfo() {
        System.out.println("Tytuł książki: " + title);
        System.out.println("Autor książki: " + author );
        System.out.println("Wydawca: " + publisher);
        System.out.println("Ilość stron: " + numPages);
        System.out.println("ISBN: " + isbn );
        System.out.println("Rok wydania: " + yearPublish);
    }
}
