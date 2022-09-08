package lab2;

public class ReverseMas {
    public static void main(String[] args) {
        String[] mas = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9 - i; j++) {
                String a = mas[j];
                mas[j] = mas[j + 1];
                mas[j + 1] = a;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
