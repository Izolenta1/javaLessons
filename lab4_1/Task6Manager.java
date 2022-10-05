package lab4_1;

public class Task6Manager extends Task6Employer {
    private double averageSum;

    public Task6Manager(String firstName, String lastName, double income, double averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }

    @Override
    public double getIncome(int days) {
        if (days > 15) {
            return this.income * 12 + this.averageSum;
        }
        else {
            return this.income + this.averageSum;
        }
    }
}
