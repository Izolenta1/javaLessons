package lab2;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] wordMas = input.split(" ");
        System.out.println(wordMas.length);
    }
}
