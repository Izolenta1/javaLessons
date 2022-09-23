package lab4;

public class Task2Tie extends Task2Clothes implements Task2MenClothing{
    public Task2Tie(Task2ENUM size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public String dressMan() {
        return "Мужской галстук";
    }
}
