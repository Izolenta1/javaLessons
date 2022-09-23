package lab4;

public enum Task1ENUM {
    WINTER(-7.0),
    SPRING(9.0),
    SUMMER(19.0) {
        @Override public String getDescription() {
            return "Теплое время года";
        }

    },
    AUTUMN(9.0);

    private double averageTemp;

    private Task1ENUM (double averageTemp) {
        this.averageTemp = averageTemp;
    }

    public double getAverageTemp() {
        return this.averageTemp;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
