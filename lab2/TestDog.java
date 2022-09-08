package lab2;

import java.util.ArrayList;

public class TestDog {
    private ArrayList<Dog> dogMas = new ArrayList<>();

    public static void main(String[] args) {
        TestDog test = new TestDog();

        Dog dogObj1 = new Dog("Alex", 12);
        test.addDog(dogObj1);

        Dog dogObj2 = new Dog("Buch", 6);
        test.addDog(dogObj2);

        test.printMas();
    }

    public void addDog(Dog dogObj) {
        this.dogMas.add(dogObj);
    }

    public void printMas() {
        for (int i = 0; i < dogMas.size(); i++) {
            System.out.println(dogMas.get(i).toString());
        }
    }
}
