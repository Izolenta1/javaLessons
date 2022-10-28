package lab8;

import java.util.Scanner;

public class task17 {
    public static int recursion(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n <= 0){
            return 0;
        }
        else{
            return Math.max(n,recursion());
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion());
    }
}
