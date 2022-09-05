package lab1;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] Mas = new int[10];
        for (int i = 0; i < 10; i++){
            Mas[i] = sc.nextInt();
        }

        float mediumNum = 0;
        int masSum = 0;
        for (int i = 0; i < 10; i++) {
            masSum += Mas[i];
            mediumNum += Mas[i];
        }
        mediumNum = (float) mediumNum / 10;

        System.out.println(masSum);
        System.out.println(mediumNum);
    }
}
