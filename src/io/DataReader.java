package io;

import model.Book;

import java.util.Scanner;

public class DataReader {
    private Scanner sc = new Scanner(System.in);

    public void close() {
        sc.close();
    }

    public int getInt() {
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }

    public Book readAndCreateBook() {
        System.out.println("Tytuł: ");
        String title = sc.nextLine();
        System.out.println("Autor: ");
        String author = sc.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = sc.nextLine();
        System.out.println("Ilość stron: ");
        int numPages = getInt();
        System.out.println("Rok wydania: ");
        int yearPublish = getInt();
        System.out.println("ISBN: ");
        long isbn = sc.nextLong();
        sc.nextLine();


        return new Book(title, author, publisher, numPages, yearPublish, isbn);

    }
}
