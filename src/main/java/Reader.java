import java.util.Random;

public class Reader {

    public static Book choiseBook(Book[] b) {
        Random rn = new Random();
        int randomNum = rn.nextInt(10);
        return b[randomNum];
    }
}
