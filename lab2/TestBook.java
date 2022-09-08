package lab2;

public class TestBook {
    public static void main(String[] args) {
        BookShelf bookShelfObj = new BookShelf(5);
        Book bookObj = new Book("human", "test1", 2010);
        bookShelfObj.addBook(bookObj, 0);
        bookObj = new Book("human", "test2", 2195);
        bookShelfObj.addBook(bookObj, 1);
        bookObj = new Book("human", "test3", 2146);
        bookShelfObj.addBook(bookObj, 2);
        bookObj = new Book("human", "test4", 1956);
        bookShelfObj.addBook(bookObj, 3);
        bookObj = new Book("human", "test5", 2004);
        bookShelfObj.addBook(bookObj, 4);

        System.out.println(bookShelfObj.getEarliestBook().toString());
        System.out.println(bookShelfObj.getOldestBook().toString());

        System.out.println("===================");
        bookShelfObj.printBookMas();
        bookShelfObj.sortBookShelf();

        System.out.println("===================");
        bookShelfObj.printBookMas();
    }
}
