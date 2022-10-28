package lab10;

import java.util.Comparator;

public class StudentComparator implements Comparator{
    @Override
    public int compare(Object student1, Object student2) {
        return ((Student) student1).getGroup()-((Student)student2).getGroup();
    }
}
