package lab3;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class TaskFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random randomizer = new Random();

        int n = sc.nextInt();
        while (n <= 0) {
            System.out.println("Повторите ввод");
            n = sc.nextInt();
        }

        int[] mas = new int[n];

        for (int i = 0; i < n; i++) {
            mas[i] = randomizer.nextInt(n);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(mas[i]);
            System.out.print(" ");
        }

        System.out.println("");

        ArrayList<Integer> chetMas = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (mas[i] % 2 == 0 & mas[i] != 0) {
                chetMas.add(mas[i]);
            }
        }

        if (chetMas.size() != 0) {
            for (int i = 0; i < chetMas.size(); i++) {
                System.out.print(chetMas.get(i));
                System.out.print(" ");
            }
        }
        else {
            System.out.println("Четных чисел нет");
        }
    }
}
