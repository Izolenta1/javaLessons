package lab11.task2_4;

import java.util.Calendar;

public class Task2DateClass {
    Calendar userCalendar = Calendar.getInstance();
    Calendar systemCalendar = Calendar.getInstance();

    public Task2DateClass(int yearUser,int monthUser, int dayUser, int hourUser,int minuteUser){
        userCalendar.set(Calendar.YEAR, yearUser);
        userCalendar.set(Calendar.MONTH, monthUser - 1);
        userCalendar.set(Calendar.DAY_OF_MONTH, dayUser);
        userCalendar.set(Calendar.HOUR_OF_DAY, hourUser);
        userCalendar.set(Calendar.MINUTE, minuteUser);
        userCalendar.get(Calendar.SECOND);
    }

    public Task2DateClass(){
        systemCalendar.get(Calendar.YEAR);
        systemCalendar.get(Calendar.MONTH);
        systemCalendar.get(Calendar.DAY_OF_MONTH);
        systemCalendar.get(Calendar.HOUR_OF_DAY);
        systemCalendar.get(Calendar.MINUTE);
        systemCalendar.get(Calendar.SECOND);
    }
    public void printUser(){
        System.out.println("Время введенное пользователем: " + userCalendar.getTime());
    }

    public void print(){
        System.out.println("Системное время: " + systemCalendar.getTime());
    }

    public void compareCal(){
        System.out.println("Итог сравнения: ");
        System.out.println(systemCalendar.getTime().equals(userCalendar.getTime()));
    }
}
