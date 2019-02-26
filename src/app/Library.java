package app;
import data.Book;

public class Library {
    public static void main(String[] args) {

        ProgramInfo info = new ProgramInfo();

        Book book1 = new Book(
                "W pustyni i w puszczy",
                "Henryk Sienkiewicz",
                "Greg",
                296, 2010,
                9_788_373_271_890L);

        Book book2 = new Book(
                "Java. Efektywne programowanie. Wydanie II",
                "Joshua Bloch",
                "Greg",
                352, 2009,
                9_788_324_620_845L);


        book1.showInfo();
        book2.showInfo();

    }
}
