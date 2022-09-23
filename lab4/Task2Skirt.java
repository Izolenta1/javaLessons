package lab4;

public class Task2Skirt extends Task2Clothes implements Task2WomenClothing, Task2MenClothing{
    public Task2Skirt(Task2ENUM size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public String dressWoman() {
        return "Женская юбка";
    }

    @Override
    public String dressMan() {
        return "Мужская юбка";
    }
}
