package practice.dsa;

public class MissingNumberInArray {

    //array = {1,2,4,5,6}
    //array would be 1 to n
    //so array length or number of items would be n+1
    //i loop with number 1 to n+1
    //j loop to check if this element is present in array
    //if yes then continue else missing number is found

    public static void main(String[] args) {
        int[] array = new int[]{2,1,4,6,5};
        int arrayLength = array.length;
        int missingNumber = 0;

        for(int i=1; i<=arrayLength+1; i++){
            boolean flag = false;
            for(int j=0; j<arrayLength; j++){
                if(i == array[j]){
                    flag = true;
                    break;
                }
                else {
                    flag = false;
                }
            }
            if(!flag){
                missingNumber = i;
            }
        }
        System.out.println(missingNumber);
    }
}
