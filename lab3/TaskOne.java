package lab3;

import java.util.Random;
import java.lang.Math;

public class TaskOne {
    public static void main(String[] args) {
        Random randomizer = new Random();

        float firstMas[] = new float[10];
        float secondMas[] = new float[10];

        for (int i = 0; i < 10; i++) {
            firstMas[i] = randomizer.nextFloat() * 100;
            secondMas[i] = (float) Math.random() * 100;
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f", firstMas[i]);
            System.out.print(" ");
        }

        System.out.println("");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f", secondMas[i]);
            System.out.print(" ");
        }

        float[] firstMasSorted = sortMas(firstMas);
        float[] secondMasSorted = sortMas(secondMas);

        System.out.println("\n==========================");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f", firstMasSorted[i]);
            System.out.print("   ");
        }

        System.out.println("");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f", secondMasSorted[i]);
            System.out.print("     ");
        }
    }

    public static float[] sortMas(float[] mas) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                if (mas[j] > mas[j + 1]) {
                    float a = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = a;
                }
            }
        }

        return mas;
    }
}
