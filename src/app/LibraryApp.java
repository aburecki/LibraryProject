package app;
import io.DataReader;
import model.Book;

public class LibraryApp {
    public static void main(String[] args) {

        ProgramInfo info = new ProgramInfo();
        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();



//        books[0] = new Book(
//                "W pustyni i w puszczy",
//                "Henryk Sienkiewicz",
//                "Greg",
//                296, 2010,
//                9_788_373_271_890L);
//
//        books[1] = new Book(
//                "Java. Efektywne programowanie. Wydanie II",
//                "Joshua Bloch",
//                "Greg",
//                352, 2009,
//                9_788_324_620_845L);

    }
}
