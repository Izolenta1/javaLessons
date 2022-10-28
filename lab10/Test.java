package lab10;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Ilya","Ivanov","programmer",1,21),
                new Student("Ivan","Zulin","doctor",2,34),
                new Student("Pavel","Pavlovich","economist",1,40),
                new Student("Mike","Vazovski","engineer",3,22)
        };

        for(int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }

        System.out.println();
        System.out.println("Быстрая сортировка");
        qSort(students, students.length-1, 0);

        for(int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }

        System.out.println();
        System.out.println("Сортировка слиянием");


        Student[] students2 = new Student[]{
                new Student("Nikolai","Zikov","journalist",4,12),
                new Student("Buch","Chinin","operator",4,67),
                new Student("Angela","Marisovna","nurse",5,99),
                new Student("Andrew","Unike","programmer",6,56)
        };
        Student[] allStudents = new Student[students.length + students2.length];
        System.arraycopy(students, 0, allStudents,0,students.length);
        System.arraycopy(students2, 0, allStudents,students.length, students2.length);
        mergeSort(allStudents, allStudents.length);

        for(int i = 0; i < allStudents.length; i++){
            System.out.println(allStudents[i]);
        }

    }

    private static StudentComparator comp = new StudentComparator();
    public static void qSort(Object[] array, int high, int low){
        if(array == null || array.length == 0) return;
        if(high <= low) return;

        Object middle = array[(low + high)/2];
        ArrayList<Object> left = new ArrayList<>();
        ArrayList<Object> right = new ArrayList<>();
        ArrayList<Object> eq = new ArrayList<>();
        for(int i = low; i <= high; i++){
            if(comp.compare(array[i], middle) > 0){
                right.add(array[i]);
            }
            else if (comp.compare(array[i], middle) < 0)
                left.add(array[i]);
            else eq.add(array[i]);
        }
        Object[] leftArr;
        Object[] rightArr;
        if(left.size()>0) {
            leftArr = left.toArray();
            qSort(leftArr, left.size() - 1, 0);
            System.arraycopy(leftArr, 0, array, low, left.size());
        }
        System.arraycopy(eq.toArray(), 0, array, low+left.size(), eq.size());

        if(right.size() > 0) {
            rightArr = right.toArray();
            qSort(rightArr, right.size() - 1, 0);
            System.arraycopy(rightArr, 0, array, low+left.size() + eq.size(), right.size());

        }

    }

    public static void mergeSort(Student[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        System.arraycopy(a, 0, l, 0, mid);
        System.arraycopy(a, mid, r, 0, n - mid);
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }
    public static void merge(
            Student[] a, Student[] l, Student[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].compareTo(r[j]) <= 0) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
