package practice.dsa;

public class MissingNumberInArray {

    //array = {1,2,4,5,6}
    //array would be 1 to n
    //so array length or number of items would be n+1
    //i loop with number 1 to n+1
    //j loop to check if this element is present in array
    //if yes then continue else missing number is found

    public static void main(String[] args) {
        int n = 10;
        int[] inputArray = new int[]{1,3};
        boolean[] numberState = new boolean[n+1];
        int missingNum = 0;

        for(int i=0; i<inputArray.length; i++){
            int indexOfNumberState = inputArray[i];
            numberState[indexOfNumberState] = true;
        }

        for(int i=1; i<numberState.length; i++){
            if(numberState[i] == false){
                System.out.println(i);
            }
        }

    }
}
