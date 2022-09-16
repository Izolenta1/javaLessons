package lab3;

import java.util.Random;

public class TaskThree {
    public static void main(String[] args) {
        int[] mas = new int[4];

        for (int i = 0; i < 4; i++) {
            mas[i] = randomInDiap(10, 99);
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(mas[i]);
            System.out.print(" ");
        }

        boolean flag = true;
        for (int i = 0; i < 3; i++) {
            if (mas[i] < mas[i + 1]) {
                flag = false;
            }
        }

        System.out.println("");
        System.out.println(flag);
    }

    public static int randomInDiap(int min, int max) {
        Random randomizer = new Random();
        return randomizer.nextInt(max - min + 1) + min;
    }
}
