package lab13.task1;

public class Task1 {
    public static void main(String[] args) {
        workWithString("I like Java!!!");
    }

    private static void workWithString(String str){
        System.out.println("last symbol of string:  "+str.charAt(13));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));

        System.out.println(str.replace("a","o"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.substring(7,11));
    }
}
