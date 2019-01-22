class Book {

    String title, author, publisher;
    int numPages, yearPublish;
    long isbn;
    Book(String title, String author, String publisher, int numPages, int yearPublish, long isbn) {
        this.title =  title;
        this.author = author ;
        this.publisher = publisher;
        this.numPages = numPages;
        this.yearPublish = yearPublish;
        this.isbn = isbn;
    }

    Book(Book book) {
        this(book.title, book.author, book.publisher, book.numPages, book.yearPublish, book.isbn);
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
