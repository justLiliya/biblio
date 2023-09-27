import java.util.Random;

public class Reader {

    public Book choiseBook(Book[] b) {
        Random rn = new Random();
        int randomNum = rn.nextInt(10);
        return b[randomNum];
    }

    public String readBook(Book b) {
        return b.toString();
    }

    public int gradeBook(Book b) {
        int result;
        Random rn = new Random();
        int randomNum = rn.nextInt(10);
        char[] a = (b.toString().trim()).toCharArray();
        int c = a.length;
        if (b.getNumber() == 0) {
            result = c - (b.getNumber() + b.getPageNumber()) - randomNum;
        } else if (b.getPageNumber() == 0) {
            result = c - (b.getNumber() + b.getPageNumber()) - randomNum;
        } else {
            result = c - (b.getNumber() + b.getPageNumber());
        }
        return result;

    }
}
