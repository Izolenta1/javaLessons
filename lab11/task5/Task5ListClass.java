package lab11.task5;

import java.util.Collections;
import java.util.LinkedList;

public class Task5ListClass {
    LinkedList<Integer> list = new LinkedList<>();

    void add(int n) {
        for (int i = 0; i < 100000; i++) {
            list.add(n);
        }
    }

    void delete() {
        list.clear();
    }

    void searchList(int elem) {
        int index = Collections.binarySearch(list, elem);
    }
}
