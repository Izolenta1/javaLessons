package lab6.task13;

public class Task13ObservableStringBuilder {
    // Слушатель, которого надо будет уведомить
    private Task13ChangeListenerClass onChangeListener;

    //делегат
    private StringBuilder stringBuilder;


    public void setOnChangeListener(Task13ChangeListenerClass onChangeListener) {
        this.onChangeListener = onChangeListener;
    }

    public Task13ObservableStringBuilder() {
        stringBuilder = new StringBuilder();
    }


    private void notifyOnStringBuilderChangeListener(){
        if(onChangeListener != null){
            onChangeListener.onChange(this);
        }
    }

    public Task13ObservableStringBuilder append(Object obj) {
        stringBuilder.append(obj);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public String toString() {
        return stringBuilder.toString();
    }
}