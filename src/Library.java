public class Library {
    public static void main(String[] args) {

        ProgramInfo info = new ProgramInfo();

        Book book1 = new Book(
                "W pustyni i w puszczy",
                "Henryk Sienkiewicz",
                "Greg",
                296, 02010,
                9_788_373_271_890L);

        book1.showInfo();

    }
}
