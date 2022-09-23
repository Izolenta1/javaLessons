package lab4;

public class Task2Pants extends Task2Clothes implements Task2WomenClothing, Task2MenClothing{
    public Task2Pants(Task2ENUM size, int cost, String color) {
        super(size, cost, color);
    }
    @Override
    public String dressWoman() {
        return "Женские штаны";
    }

    @Override
    public String dressMan() {
        return "Мужские штаны";
    }
}
