package lab3;

public class Part3Converter {
    private double rubToUsd = 60.45;
    private double rubToEuro = 70.54;

    public double getRubToUsd() {
        return rubToUsd;
    }

    public double getRubToEuro() {
        return rubToEuro;
    }

    public double convert(String firstCur, String secondCur, double firstCurNum) {
        if (firstCur == "RUB" & secondCur == "USD") {
            return firstCurNum / this.rubToUsd;
        }
        else if (firstCur == "RUB" & secondCur == "EURO") {
            return firstCurNum / this.rubToEuro;
        }

        return 0;
    }
}
