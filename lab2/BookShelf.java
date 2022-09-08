package lab2;

public class BookShelf {
    private int masLength;
    private Book[] bookMas;

    public BookShelf(int masLength) {
        this.masLength = masLength;
        this.bookMas = new Book[masLength];
    }

    public Book getEarliestBook() {
        int data = 9999;
        Book bookToReturn = this.bookMas[0];
        for (int i = 0; i < this.masLength; i++) {
            if (this.bookMas[i].getYear() < data) {
                bookToReturn = this.bookMas[i];
                data = this.bookMas[i].getYear();
            }
        }

        return bookToReturn;
    }

    public Book getOldestBook() {
        int data = -9999;
        Book bookToReturn = this.bookMas[0];
        for (int i = 0; i < this.masLength; i++) {
            if (this.bookMas[i].getYear() > data) {
                bookToReturn = this.bookMas[i];
                data = this.bookMas[i].getYear();
            }
        }

        return bookToReturn;
    }

    public void sortBookShelf() {
        for (int i = 0; i < this.masLength; i++) {
            for (int j = 0; j < this.masLength - 1; j++) {
                if (this.bookMas[j].getYear() > this.bookMas[j + 1].getYear()) {
                    Book a = this.bookMas[j];
                    this.bookMas[j] = this.bookMas[j + 1];
                    this.bookMas[j + 1] = a;
                }
            }
        }
    }

    public void addBook(Book bookObj, int masIndex) {
        this.bookMas[masIndex] = bookObj;
    }

    public void printBookMas() {
        for (int i = 0; i < this.masLength; i++) {
            System.out.println(this.bookMas[i].toString());
        }
    }
}
