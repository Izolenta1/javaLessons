package lab6.task12;

import java.util.LinkedList;
import java.util.function.Consumer;

public class Task12UndoStringBuilder {
    private StringBuilder sb;
    private LinkedList<Consumer<StringBuilder>> commands = new LinkedList<>();

    public  Task12UndoStringBuilder undo() {
        if (!commands.isEmpty()) {
            commands.removeLast().accept(sb);
        }
        return this;
    }

    public Task12UndoStringBuilder() {
        sb = new StringBuilder();
    }

    public Task12UndoStringBuilder append(String str) {
        int beginInd = sb.length();
        sb.append(str);
        int endInd = sb.length();
        commands.add(sb -> sb.delete(beginInd, endInd));
        return this;
    }

    public String toString() {
        return sb.toString();
    }
}