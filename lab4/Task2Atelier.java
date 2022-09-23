package lab4;

import java.util.ArrayList;

public class Task2Atelier {
    private ArrayList<Task2Clothes> manClothesMas;
    private ArrayList<Task2Clothes> womanClothesMas;

    public Task2Atelier () {
        this.manClothesMas = new ArrayList<>();
        this.womanClothesMas = new ArrayList<>();
    }
    public void addManThing(Task2Clothes thing) {
        this.manClothesMas.add(thing);
    }

    public void addWomanThing(Task2Clothes thing) {
        this.womanClothesMas.add(thing);
    }

    public void dressMan() {
        for (int i = 0; i < this.manClothesMas.size(); i++) {
            System.out.println(this.manClothesMas.get(i).toString());
        }
    }

    public void dressWoman() {
        for (int i = 0; i < this.womanClothesMas.size(); i++) {
            System.out.println(this.womanClothesMas.get(i).toString());
        }
    }

    public static void main(String[] args) {
        Task2Atelier atelierObj = new Task2Atelier();

        Task2Pants pantsObj = new Task2Pants(Task2ENUM.M,1234, "red");
        Task2Skirt skirtObj = new Task2Skirt(Task2ENUM.S, 4523, "black");
        Task2Tie tieObj = new Task2Tie(Task2ENUM.M, 3452, "purple");
        Task2TShirt tshirtObj = new Task2TShirt(Task2ENUM.XS,1232, "blue");

        atelierObj.addManThing(pantsObj);
        atelierObj.addManThing(skirtObj);
        atelierObj.addManThing(tieObj);
        atelierObj.addManThing(tshirtObj);

        pantsObj = new Task2Pants(Task2ENUM.M,1234, "red");
        skirtObj = new Task2Skirt(Task2ENUM.S, 4523, "black");
        tshirtObj = new Task2TShirt(Task2ENUM.XS,1232, "blue");

        atelierObj.addWomanThing(pantsObj);
        atelierObj.addWomanThing(skirtObj);
        atelierObj.addWomanThing(tshirtObj);

        atelierObj.dressMan();
        System.out.println("============");
        atelierObj.dressWoman();
    }
}
