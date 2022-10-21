package lab6.task13;

public class Task13ChangeListenerClass implements Task13ChangeListenerInter{
    @Override
    public void onChange(Task13ObservableStringBuilder stringBuilder) {
        System.out.println("CHANGED: " + stringBuilder.toString());
    }
}
