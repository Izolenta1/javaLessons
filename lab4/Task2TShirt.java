package lab4;

public class Task2TShirt extends Task2Clothes implements Task2WomenClothing, Task2MenClothing{
    public Task2TShirt(Task2ENUM size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public String dressWoman() {
        return "Женская футболка";
    }

    @Override
    public String dressMan() {
        return "Мужская футболка";
    }
}
