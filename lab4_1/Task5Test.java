package lab4_1;

public class Task5Test {
    public static void main(String[] args) {
        Task5Reader[] readerMas = new Task5Reader[3];

        Task5Reader readerObj = new Task5Reader("Alex", 123, "BIO", "02.03.1998", "049-576");
        readerMas[0] = readerObj;

        readerObj = new Task5Reader("Buch", 123, "BIO", "02.03.1998", "049-576");
        readerMas[1] = readerObj;

        readerObj = new Task5Reader("Kate", 123, "BIO", "02.03.1998", "049-576");
        readerMas[2] = readerObj;

        Task5Book book1 = new Task5Book("Book1", "Name1");
        Task5Book book2 = new Task5Book("Book2", "Name1");
        Task5Book book3 = new Task5Book("Book3", "Name1");

        readerMas[0].takeBook(book1, book2, book3);
        System.out.println("====");
        readerMas[0].returnBook(book1, book2, book3);
    }
}
