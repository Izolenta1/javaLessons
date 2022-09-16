package lab3;

public class Part3User {
    private double balance;
    private String currency;

    public Part3User(double balance, String currency) {
        this.balance = balance;
        this.currency = currency;
    }

    public void setBalanceAndCur(double balance, String cur) {
        this.balance = balance;
        this.currency = cur;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Part3User{" +
                "balance=" + balance +
                ", currency='" + currency + '\'' +
                '}';
    }
}
