package lab7.task7_8;

public class Task7Book implements Task7Printable{
    String name;

    public Task7Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Task7Printable print() {
        System.out.println(name);
        return null;
    }

    public static void printBooks(Task7Printable[] printableMas){
        for(int i = 0; i < printableMas.length; i++){
            if(printableMas[i] instanceof Task7Book) {
                printableMas[i].print();
            }
        }
    }
}
