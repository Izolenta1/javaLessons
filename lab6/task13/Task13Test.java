package lab6.task13;

public class Task13Test {
    public static void main(String[] args) {
        Task13ObservableStringBuilder observableString = new Task13ObservableStringBuilder();

        observableString.setOnChangeListener(new Task13ChangeListenerClass());

        observableString.append("test");
        observableString.append("fgshsh");
        observableString.append("12345");
    }
}
