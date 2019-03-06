package model;

public class Book extends Publication {

    private String author;
    private int numPages;
    private long isbn;

    public Book(String title, String author, String publisher, int numPages, int yearPublish, long isbn) {
        this(title, author, publisher, numPages,yearPublish);
        this.isbn = isbn;
    }
    public Book(String title, String author, String publisher, int numPages, int yearPublish) {
        setTitle(title);
        this.author = author ;
        setPublisher(publisher);
        this.numPages = numPages;
        setYear(yearPublish);
    }


    public Book(Book book)
    {
        this(book.getTitle(), book.getAuthor(), book.getPublisher(), book.getNumPages(), book.getYear(), book.getIsbn());
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }


    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public void showInfo() {
        System.out.println("Tytuł książki: " + getTitle());
        System.out.println("Autor książki: " + author );
        System.out.println("Wydawca: " + getPublisher());
        System.out.println("Ilość stron: " + numPages);
        if(isbn != 0) { System.out.println("ISBN: " + isbn); }
        System.out.println("Rok wydania: " + getYear());
        System.out.println("------------------------------------------ ");
    }
}
