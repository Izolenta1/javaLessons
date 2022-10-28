package lab11.task5;

import java.util.ArrayList;
import java.util.Collections;

public class Task5ArrayClass {
    ArrayList<Integer> arrayList = new ArrayList<>();

    void insert(int n){
        for(int i = 0; i < 100000; i++) {
            arrayList.add(n);
        }
    }

    void delete(){
        arrayList.clear();
    }

    void search(int elem){
        int index = Collections.binarySearch(arrayList, elem);
    }
}
