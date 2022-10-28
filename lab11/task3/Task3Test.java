package lab11.task3;

import java.util.Calendar;

public class Task3Test {
    public static void main(String[] args) {
        Calendar birthDate = Calendar.getInstance();
        birthDate.set(Calendar.YEAR, 2001);
        birthDate.set(Calendar.MONTH, 6);
        birthDate.set(Calendar.DAY_OF_MONTH, 28);
        birthDate.set(Calendar.HOUR_OF_DAY, 19);
        birthDate.set(Calendar.MINUTE, 30);
        birthDate.set(Calendar.SECOND, 0);
        Task3Student Student = new Task3Student("Ivan", "Ivanov", birthDate);

        System.out.println(Student.toStringStudent(1));
        System.out.println(Student.toStringStudent(2));
        System.out.println(Student.toStringStudent(3));
    }
}
