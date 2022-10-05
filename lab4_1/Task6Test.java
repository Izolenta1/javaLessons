package lab4_1;

public class Task6Test {
    public static void main(String[] args) {
        Task6Employer manager = new Task6Manager("Alex", "Katagirev", 12533.0, 2123.0);
        Task6Employer employer = new Task6Employer("Buch", "Hasagivech", 35642);

        System.out.println(employer.getIncome(16));
        System.out.println(manager.getIncome(14));
    }
}
