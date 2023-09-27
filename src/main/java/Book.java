public class Book {

    public String getTitle() {
        return title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getAutor() {
        return autor;
    }

    public Book setAutor(String autor) {
        this.autor = autor;
        return this;
    }

    public int getNumber() {
        return number;
    }

    public Book setNumber(int number) {
        this.number = number;
        return this;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public Book setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    String title;
    String autor;
    int number;
    int pageNumber;

    public Book() {

    }

    public Book(String title, String autor) {
        this.title = title;
        this.autor = autor;
    }

    public Book(String title, String autor, int number, int pageNumber) {
        this.title = title;
        this.autor = autor;
        this.number = number;
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title);
        sb.append(autor);
        return sb.toString();
    }


}
