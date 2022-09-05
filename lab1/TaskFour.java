package lab1;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args){
        System.out.println("Введите размер массива");

        Scanner sc = new Scanner(System.in);
        int masLength = sc.nextInt();

        int[] Mas = new int[masLength];

        for (int i = 0; i < masLength; i++) {
            Mas[i] = sc.nextInt();
        }

        int sumMas = 0;
        int max = 0;
        int min = 2147483647;
        int cycleCounter = 0;
        while (cycleCounter != 10) {
            sumMas += Mas[cycleCounter];

            if (Mas[cycleCounter] >= max) {
                max = Mas[cycleCounter];
            }

            if (Mas[cycleCounter] <= min) {
                min = Mas[cycleCounter];
            }

            cycleCounter += 1;
        }

        System.out.println(sumMas);
        System.out.println(max);
        System.out.println(min);
    }
}
