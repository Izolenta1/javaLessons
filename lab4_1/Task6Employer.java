package lab4_1;

public class Task6Employer {
    protected String firstName;
    protected String lastName;
    protected double income;

    public Task6Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public double getIncome(int days) {
        if (days > 15) {
            return this.income * 12;
        }
        else {
            return this.income;
        }
    }
}
