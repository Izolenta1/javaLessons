package lab2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Alex", "mirea@ya.ru", 'M');

        System.out.println(author.getName());
        System.out.println(author.getEmail());
        System.out.println(author.getGender());
    }
}