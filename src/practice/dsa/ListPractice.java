package practice.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



//String str = "My name is Snehal";
//String str2 = "My name is Ruturaj";
//split words of string and store it in array
//use for loop to iterate through each element in string array
//if words length is even then add to list
//else move to the next word
public class ListPractice {

    public static void main(String[] args) {
        String firstString = "My name is Snehal";
        String secondString = "My name is Ruturaj";
        String[] array = secondString.split(" ");
        List<String> list = new ArrayList<String>();

        for(int i=0; i<array.length; i++){
            if(array[i].length() %2 == 0){
                list.add(array[i]);
            }
        }

        for(String even : list){
            System.out.println(even);
        }
    }

}
