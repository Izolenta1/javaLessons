package lab9.task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Task4Test {
    public static void main(String[] args) {
        ArrayList<Task4Car> carMas = new ArrayList<Task4Car>();
        carMas.add(new Task4Car("Mercedes",12058365,235));
        carMas.add(new Task4Car("KIA",3860471,124));
        carMas.add(new Task4Car("Porsche",7937158,187));

        Collections.sort(carMas);
        for(int i = 0; i < carMas.size(); i++){
            System.out.println(carMas.get(i));
        }
    }
}
