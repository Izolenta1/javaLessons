package lab7.task7_8;

public class Task7Magazine implements Task7Printable{
    String name;

    public Task7Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void printMagazines(Task7Printable[] printableMas){
        for(int i = 0; i < printableMas.length; i++){
            if(printableMas[i] instanceof Task7Magazine) {
                printableMas[i].print();
            }
        }
    }

    @Override
    public Task7Printable print() {
        System.out.println(name);
        return null;
    }
}
