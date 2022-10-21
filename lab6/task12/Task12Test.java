package lab6.task12;

public class Task12Test {
    public static void main(String[] args) {
        Task12UndoStringBuilder undoString = new Task12UndoStringBuilder();

        undoString.append("erer");
        System.out.println(undoString);

        undoString.append("tytyty");
        System.out.println(undoString);

        undoString.undo();
        System.out.println(undoString);
    }
}