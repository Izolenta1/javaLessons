package lab4_1;

public class Task5Reader {
    private String name;
    private int readerTicketNum;
    private String faculty;
    private String birthData;
    private String number;

    public Task5Reader(String name, int readerTicketNum, String faculty, String birthData, String number) {
        this.name = name;
        this.readerTicketNum = readerTicketNum;
        this.faculty = faculty;
        this.birthData = birthData;
        this.number = number;
    }

    public void takeBook(int num) {
        System.out.println(this.name + " взял " + Integer.toString(num) + " книги");
    }

    public void takeBook(String... bookNames) {
        System.out.print(this.name + " взял книги: ");

        for (int i = 0; i < bookNames.length; i++) {
            System.out.print(bookNames[i] + " ");
        }

        System.out.print("\n");
    }

    public void takeBook(Task5Book... books) {
        System.out.print(this.name + " взял книги: ");

        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getName() + " ");
        }

        System.out.print("\n");
    }

    public void returnBook(int num) {
        System.out.println(this.name + " вернул " + Integer.toString(num) + " книги");
    }

    public void returnBook(String... bookNames) {
        System.out.print(this.name + " вернул книги: ");

        for (int i = 0; i < bookNames.length; i++) {
            System.out.print(bookNames[i] + " ");
        }

        System.out.print("\n");
    }

    public void returnBook(Task5Book... books) {
        System.out.print(this.name + " вернул книги: ");

        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getName() + " ");
        }

        System.out.print("\n");
    }
}
