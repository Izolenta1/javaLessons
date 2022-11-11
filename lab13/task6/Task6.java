package lab13.task6;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();

        String[] words = fileName.split(" ");

        StringBuilder result = getLine(words);
        if (result == null) {
            System.out.println("Результат не найден");
        }
        else {
            System.out.println(result.toString());
        }
    }

    public static StringBuilder getLine(String... words){
        StringBuilder result = new StringBuilder();
        if (words == null || words.length == 0) {
            return result;
        }
        if (words.length==1 || words[0].equals("")) {
            return result.append(words[0]);
        }

        ArrayList<String> wordsList = new ArrayList<>();

        wordsList.addAll(Arrays.asList(words));
        int iter = 0;
        while (isTrue(wordsList)) {
            Collections.shuffle(wordsList);
            iter += 1;

            if (iter > 10000) {
                return null;
            }
        }
        for (String word : wordsList){
            result.append(word).append(" ");
        }
        result.deleteCharAt(result.length()-1);
        return result;
    }

    public static boolean isTrue(ArrayList<String> wordsList) {
        for (int i = 0; i < wordsList.size() - 1; i++) {
            String firstWord = wordsList.get(i).toLowerCase();
            String secondWord = wordsList.get(i + 1).toLowerCase();
            if (firstWord.charAt(firstWord.length() - 1) != secondWord.charAt(0)) {
                return true;
            }
        }
        return false;
    }
}
