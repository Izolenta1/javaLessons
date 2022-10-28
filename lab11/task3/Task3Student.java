package lab11.task3;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Task3Student {
    private String name;
    private String surname;
    private Calendar birthDate;


    public Task3Student(String name, String surname, Calendar birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String toStringStudent(int dataType) {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy, d MMMM");
        SimpleDateFormat sdf2  = new SimpleDateFormat("yyyy.MM.dd 'в' hh:mm");
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy, dd MMMM 'в' hh:mm:ss");
        switch (dataType) {
            case 1:
                return "Task3Student{" +
                        "name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                        '}' + " date = " + sdf1.format(this.birthDate.getTime());
            case 2:
                return "Task3Student{" +
                        "name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                        '}' + " date = " + sdf2.format(this.birthDate.getTime());
            case 3:
                return "Task3Student{" +
                        "name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                        '}' + " date = " + sdf3.format(this.birthDate.getTime());
            default:
                return "Отсутствует тип даты";
        }
    }
}
