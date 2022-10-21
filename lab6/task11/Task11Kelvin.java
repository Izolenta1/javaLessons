package lab6.task11;

public class Task11Kelvin implements Task11Convertable{
    private double cel;

    public Task11Kelvin(double cel) {
        this.cel = cel;
    }

    @Override
    public double convert() {
        return cel+273.15 ;
    }
}
