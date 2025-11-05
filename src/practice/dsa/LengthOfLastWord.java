package practice.dsa;

import java.util.Arrays;

public class LengthOfLastWord {

    public static void main(String[] args) {
        String str = "This is hello world";
        String[] arr = str.split(" ");
        int lengthOfArray = arr.length;
        String lastWord = arr[lengthOfArray - 1];
        int lengthOfLastWord = lastWord.length();
        System.out.println(lengthOfLastWord);
    }
}
