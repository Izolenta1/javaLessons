package lab11.task2_4;

import java.util.Scanner;

public class Task2Test {
    public static void main(String[] args) {
        Task2DateClass systemCalendar = new Task2DateClass();
        systemCalendar.print();

        Scanner in = new Scanner(System.in);
        System.out.println("Entre Date:");
        int year = in.nextInt();
        int month = in.nextInt();
        int day = in.nextInt();
        int hour = in.nextInt();
        int minute = in.nextInt();

        Task2DateClass userCalendar = new Task2DateClass(year,month,day,hour,minute);
        userCalendar.printUser();

        userCalendar.compareCal();
    }
}
