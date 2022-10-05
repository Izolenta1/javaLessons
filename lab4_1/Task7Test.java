package lab4_1;

public class Task7Test {
    public static void main(String[] args) {
        Task7Learner[] learnerMas = new Task7Learner[5];

        Task7Schoolchild learner1 = new Task7Schoolchild("Alex", "schoolchild");
        Task7Student learner2 = new Task7Student("Buch", "student");
        Task7Student learner3 = new Task7Student("Kate", "student");
        Task7Schoolchild learner4 = new Task7Schoolchild("Aang", "schoolchild");
        Task7Schoolchild learner5 = new Task7Schoolchild("Ilya", "schoolchild");

        learnerMas[0] = learner1;
        learnerMas[1] = learner2;
        learnerMas[2] = learner3;
        learnerMas[3] = learner4;
        learnerMas[4] = learner5;

        System.out.print("Students: ");
        for (int i = 0; i < learnerMas.length; i++) {
            if (learnerMas[i].getStatus() == "student") {
                System.out.print(learnerMas[i].getName() + " ");
            }
        }
        System.out.print("\n");
        System.out.print("Schoolchildren: ");
        for (int i = 0; i < learnerMas.length; i++) {
            if (learnerMas[i].getStatus() == "schoolchild") {
                System.out.print(learnerMas[i].getName() + " ");
            }
        }
    }
}
