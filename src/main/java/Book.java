public class Book {

    String title;
    String autor;
    int number;
    int pageNumber;

    public Book(){

    }

    public Book(String title, String autor){
        this.title = title;
        this.autor = autor;
    }

    public Book(String title, String autor, int number, int pageNumber){
        this.title = title;
        this.autor = autor;
        this.number = number;
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(title);
        sb.append(autor);
        return sb.toString();
    }
}
