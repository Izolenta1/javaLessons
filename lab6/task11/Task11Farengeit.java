package lab6.task11;

public class Task11Farengeit implements Task11Convertable{
    private double cel;

    public Task11Farengeit(double cel) {
        this.cel = cel;
    }

    @Override
    public double convert() {
        return (1.8*cel)+32;
    }
}
