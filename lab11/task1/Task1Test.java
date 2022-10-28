package lab11.task1;

import java.util.Calendar;
import java.util.Date;


public class Task1Test {
    public static void main(String[] args) {
        displayInfo(2021, 11, 14, 22, 10);
    }

    public static void displayInfo(int year, int month, int day, int hour, int minute) {
        Task1Person developer = new Task1Person("Ivan","Ivanov");

        Calendar Cal = Calendar.getInstance();
        Cal.set(Calendar.YEAR, year);
        Cal.set(Calendar.MONTH, month);
        Cal.set(Calendar.DAY_OF_MONTH, day);
        Cal.set(Calendar.HOUR_OF_DAY, hour);
        Cal.set(Calendar.MINUTE, minute);
        Cal.set(Calendar.SECOND, 0);

        System.out.println("Разработчик:");
        System.out.println("Имя: " + developer.getName());
        System.out.println("Фамилия: " + developer.getSurname() + "\n");

        Date startDate = Cal.getTime();
        System.out.println("Задание получено: " + startDate);

        Date currTime = new Date();
        System.out.println("Задание сдано: " + currTime);
    }
}
