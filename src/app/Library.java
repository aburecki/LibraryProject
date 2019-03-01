package app;

import data.Book;

public class Library {
    public static void main(String[] args) {

        ProgramInfo info = new ProgramInfo();
        Book[] books = new Book[1000];


        books[0] = new Book(
                "W pustyni i w puszczy",
                "Henryk Sienkiewicz",
                "Greg",
                296, 2010,
                9_788_373_271_890L);

        books[1] = new Book(
                "Java. Efektywne programowanie. Wydanie II",
                "Joshua Bloch",
                "Greg",
                352, 2009,
                9_788_324_620_845L);


        books[0].showInfo();
        books[1].showInfo();

    }
}
