package lab8;

import java.util.Scanner;

public class task16 {
    public static void recursion(int max,int count) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n > 0) {
            if (n > max) {
                recursion(n, 1);
            }
            else if (n == max) {
                recursion(max, count += 1);
            }
            else {
                recursion(max, count);
            }
        }
        else {
            System.out.println(count);
        }
    }
    public static void main(String[] args) {
        recursion(0,0);
    }
}
