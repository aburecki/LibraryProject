package app;

public enum Option {
    EXIT(0, "Wyjście z programu"),
    ADD_BOOK(1,"Dodanie książki"),
    ADD_MAGAZINES(2, "Dodanie magazynu/gazety"),
    PRINT_BOOKS(3,"Wyświetlanie dostępnych książek"),
    PRINT_MAGAZINES(4,"Wyświetalnie dostępnych magazynów/gazet");

    private int value;
    private String description;

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    Option(int value, String description) {
        this.value = value;
        this.description = description;
    }


    public  String toString() {
        return value + " - " + description;
    }
    static Option createFromInt(int option) {
        return Option.values()[option];
    }










}
