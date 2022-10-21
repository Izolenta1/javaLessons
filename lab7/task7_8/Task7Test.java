package lab7.task7_8;

public class Task7Test {
    public static void main(String[] args) {
        Task7Printable[] printableMas = new Task7Printable[3];
        printableMas[0] = new Task7Magazine("magazine1");
        printableMas[1] = new Task7Book("book1");
        printableMas[2] = new Task7Magazine("magazine2");

        int k=0;
        for(int i = 0; i < printableMas.length; i++) {
            if (printableMas[i] instanceof Task7Magazine){
                System.out.println("Magazines:");
                Task7Magazine.printMagazines(printableMas);
                break;
            }
        }
        for(int i = 0; i < printableMas.length; i++) {
            if (printableMas[i] instanceof Task7Book) {
                System.out.println("Books: ");
                Task7Book.printBooks(printableMas);
                break;
            }
        }
    }
}
