package practice.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {

        String str = "My name is Snehal";
        String str2 = "My name is Ruturaj";

        String[] array = str.split(" ");
        int arrayLength = array.length;
        int count = 0;

        for(int i = 0; i<arrayLength; i++){
            String currWord = array[i];
            int lengthOfCurrWord = currWord.length();
            if(lengthOfCurrWord % 2 == 0){
                count++;
            }
            else{
                continue;
            }
        }

        String[] list = new String[count];

        for(int i=0; i<arrayLength; i++){
            String currWord = array[i];
            int lengthOfCurrWord = currWord.length();
            if(lengthOfCurrWord % 2 == 0){
                list[i] = currWord;
            }
            else{
                continue;
            }
        }

        System.out.println(Arrays.toString(list));
    }

    //String str = "My name is Snehal";
    //String str2 = "My name is Ruturaj";
    //split words of string and store it in array
    //use for loop to iterate through each element in string array
    //if words length is even then add to list
    //else move to the next word
}
