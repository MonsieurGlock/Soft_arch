import java.io.IOException;
import java.io.PrintWriter;

public class PrintToScreen {
    public static void printToScreen(Book book) {
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }

}
