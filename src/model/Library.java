package model;

public class Library {

    private static final int MAX_PUBLICATIONS = 2000;
    private Publication[] publications = new Publication[MAX_PUBLICATIONS];
    private int publicationsNumber;

    public void addBook(Book book) {
        if (publicationsNumber < MAX_PUBLICATIONS) {
            publications[publicationsNumber] = book;
            publicationsNumber++;
        } else {
            System.out.println("Maksymalna liczba książek została osiągnięta!");
        }
    }

    public void printBooks() {
        int countBooks = 0;
        for (int i = 0; i < publicationsNumber; i++) {
            if (publications[i] instanceof Book) {
                publications[i].showInfo();
            }
        }
        if (countBooks == 0) {
            System.out.println("Brak książek w bibliotece");
        }
    }

    public void addMagazine(Magazine magazine) {
        if (publicationsNumber < MAX_PUBLICATIONS) {
            publications[publicationsNumber] = magazine;
            publicationsNumber++;
        } else {
            System.out.println("Maksymalna liczba magaznów została osiągnięta");
        }
    }

    public void printMagazines() {
        int countMagazines = 0;
        for (int i = 0; i < publicationsNumber; i++) {
            if (publications[i] instanceof Magazine) {
                publications[i].showInfo();
                countMagazines++;
            }
        }

        if (countMagazines == 0) {
            System.out.println("Brak magazynów w bibliotece");
        }


    }
}

