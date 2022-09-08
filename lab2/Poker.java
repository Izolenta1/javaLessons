package lab2;

import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        String[] cardMas = new String[52];

        for (int i = 0; i < 52; i++) {
            cardMas[i] = String.valueOf(i);
        }

        System.out.println("Введите кол-во игроков");
        Scanner sc = new Scanner(System.in);

        int playerCount = sc.nextInt();
        int counter = 0;
        for (int i = 1; i < playerCount + 1; i++) {
            for (int j = counter; j < 5 * i; j++) {
                System.out.print(cardMas[j] + " ");
                counter++;
            }
            System.out.println("");
        }

    }
}
