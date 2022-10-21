package lab7.task5_6;

public class Task5ProcessStrings implements Task5StringWork{
    @Override
    public void countSymbols(String s) {
        int len = s.length();
        System.out.println(len);
    }

    @Override
    public String newString(String s) {
        String odd = "";
        for(int j =0; j<s.length(); j++) {
            if(j %2 == 0){
                odd += s.charAt(j);
            }
        }
        return odd;
    }

    @Override
    public void reverseString(String s) {
        String reverse = new StringBuilder(s).reverse().toString();
        System.out.println(reverse);
    }
}
