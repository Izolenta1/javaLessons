package lab1;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(fact(num));
    }

    public static int fact(int num) {
        int result = 1;
        for (int i = 2; i < num + 1; i++) {
            result = result * i;
        }
        return result;
    }
}
