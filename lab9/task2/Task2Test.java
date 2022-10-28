package lab9.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Task2Test {
    public static void main(String[] args) {
        ArrayList<Task2SortingStudentsByGPA> students = new ArrayList<>();

        students.add(new Task2SortingStudentsByGPA("John",432));
        students.add(new Task2SortingStudentsByGPA("Tom",345));
        students.add(new Task2SortingStudentsByGPA("Andrew",435));
        students.add(new Task2SortingStudentsByGPA("Mika",235));
        students.add(new Task2SortingStudentsByGPA("Gera",125));
        students.add(new Task2SortingStudentsByGPA("Vladimir",476));

        Collections.sort(students, new Comparator<Task2SortingStudentsByGPA>() {
            @Override
            public int compare(Task2SortingStudentsByGPA student1, Task2SortingStudentsByGPA student2) {
                return student2.getFinalScore() - student1.getFinalScore();
            }
        });

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).toString());
        }
    }
}
