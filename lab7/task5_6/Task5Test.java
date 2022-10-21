package lab7.task5_6;

public class Task5Test {
    public static void main(String[] args) {
        Task5StringWork stringWork = new Task5ProcessStrings();
        String s = "qwerty";
        System.out.print("Count symbols: ");
        stringWork.countSymbols(s);
        System.out.print("Reverse string: ");
        stringWork.reverseString(s);
        System.out.println("String odd: " + stringWork.newString(s));

    }
}
