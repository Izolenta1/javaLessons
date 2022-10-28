package lab11.task5;

import java.util.Scanner;

public class Task5Test {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Время ArrayList\n");
        Task5ArrayClass arr = new Task5ArrayClass();

        long startTime = System.currentTimeMillis();
        arr.insert(n);
        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("Команда ADD: " + estimatedTime + " ms");


        Scanner in = new Scanner(System.in);
        System.out.print("Введите элемент: ");
        int elem = in.nextInt();
        long startTime2 = System.currentTimeMillis();
        arr.search(elem);
        long estimatedTime2 = System.currentTimeMillis() - startTime2;
        System.out.println("Команда SEARCH: " + estimatedTime2 + " ms");

        long startTime1 = System.currentTimeMillis();
        arr.delete();
        long estimatedTime1 = System.currentTimeMillis() - startTime1;
        System.out.println("Команда DELETE: " + estimatedTime1 + " ms");


        System.out.println("=========================");

        System.out.println("Время для LinkedList\n");
        Task5ListClass list = new Task5ListClass();
        long startTime10 = System.currentTimeMillis();
        list.add(n);
        long estimatedTime10 = System.currentTimeMillis() - startTime10;
        System.out.println("Команда ADD: " + estimatedTime10 + " ms");


        Scanner input1 = new Scanner(System.in);
        System.out.print("Введите элемент: ");
        int elem1 = input1.nextInt();
        long startTime11 = System.currentTimeMillis();
        list.searchList(elem1);
        long estimatedTime11 = System.currentTimeMillis() - startTime11;
        System.out.println("Команда SEARCH: " + estimatedTime11 + " ms");

        long startTime12 = System.currentTimeMillis();
        list.delete();
        long estimatedTime12 = System.currentTimeMillis() - startTime12;
        System.out.println("Команда DELETE: " + estimatedTime12 + " ms");
    }
}
