package lab9.task2;

public class Task2SortingStudentsByGPA {
    private String name;
    private int finalScore;

    public Task2SortingStudentsByGPA(String name, int finalScore) {
        this.name = name;
        this.finalScore = finalScore;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", finalScore=" + finalScore +
                '}';
    }

    public String getName() {
        return name;
    }


    public int getFinalScore() {
        return finalScore;
    }
}
