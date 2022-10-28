package lab10;

import java.util.Comparator;

public class Student implements Comparable{
    public String name;
    public String surname;
    public String special;
    public int kurs;
    public int group;

    public Student(String name, String surname, String special, int kurs, int group) {
        this.name = name;
        this.surname = surname;
        this.special = special;
        this.kurs = kurs;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public int getKurs() {
        return kurs;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public int compareTo(Object student) {
        return this.group - ((Student)student).group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", special='" + special + '\'' +
                ", kurs=" + kurs +
                ", group=" + group +
                '}';
    }
}
