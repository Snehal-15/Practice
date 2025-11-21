package practice.dsa;

public class MissingNumberInArray {

    //array = {1,2,4,5,6}
    //array would be 1 to n
    //so array length or number of items would be n+1
    //i loop with number 1 to n+1
    //j loop to check if this element is present in array
    //if yes then continue else missing number is found

    public static void main(String[] args) {
       int[] array = {4,2,3,1,6};
       int actualLength = array.length+2;
       int[] indexArray = new int[actualLength];

       for(int i=0; i<array.length; i++){
           indexArray[array[i]]=1;
       }

       for(int i=1; i<indexArray.length; i++){
           if(indexArray[i] == 0){
               System.out.println("Missing number is: "+i);
           }
       }
    }
}
