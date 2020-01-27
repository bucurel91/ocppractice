package OCA.guptatests.library;

public class Book {

    private String author;
    Boolean a = false;



    public Book(String author) {

        this.author = author;
    }



    void print(String str) {
        System.out.println(str);
    }

    String print() {
        System.out.println();
        return "ok";
    }

    @Override
    public String toString() {
        return "Book{" +
            "author='" + author + '\'' +
            '}';
    }
}
