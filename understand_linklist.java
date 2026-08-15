import java.util.LinkedList;

class Book {
    private String isbn;
    private String title;
    private String auther;
    private double price;

    @Override
    public String toString() {
        return "Book [isbn=" + isbn + ", title=" + title + ", auther=" + auther + ", price=" + price + "]";
    }

    public Book(String isbn, String title, String auther, double price) {
        this.isbn = isbn;
        this.title = title;
        this.auther = auther;
        this.price = price;
    }

}

public class understand_linklist {
    public static void main(String[] args) {
        LinkedList<Book> booklist = new LinkedList<Book>();

        booklist.add(new Book("101b", "java", "aiman kazi", 1000.0));
        booklist.add(new Book("102b", "python", "aiman kazi", 1000.0));
        booklist.add(new Book("103b", "c++", "aiman kazi", 1000.0));

    }
}
