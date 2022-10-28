package lab8;

public class task15 {
    public static String recursion(int n){
        return (n / 10 > 0) ? n % 10 + "  " + recursion(n / 10) : String.valueOf(n);
    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(recursion(n));
    }
}
