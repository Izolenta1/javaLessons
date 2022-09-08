package lab2;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Computer> compMas;

    public Shop() {
        this.compMas = new ArrayList<>();
    }

    public void addComputer(Computer comp) {
        this.compMas.add(comp);
    }

    public void removeComputer(Computer comp) {
        this.compMas.remove(comp);
    }

    public void findComputer(String model) {
        for (int i = 0; i < this.compMas.size(); i++) {
            if (this.compMas.get(i).getModel().equals(model)) {
                System.out.println(this.compMas.get(i).toString());
            }
        }
    }
}
