package practice.dsa;

import java.util.Arrays;

public class Practice {

    public static void main(String[] args){
//        int[] nums = new int[]{-3,2,1,-4,-5,6,7};
//        int[] nums = new int[]{0,-3,4,5,-2,-1};
        int[] nums = new int[]{0,2,0,3,0,5,4,0};
        System.out.println(Arrays.toString(nums));
        partitionPositivesAndNegatives(nums);
        System.out.println(Arrays.toString(nums));
//        partitionZeroAndNonZeroNumbers(nums);
//        System.out.println(Arrays.toString(nums));
//        String sentence = "This is a demo program";
//        System.out.println(getLengthOfLongestWord(sentence));
    }
        public static void partitionPositivesAndNegatives(int[] nums){
            int negativeNumberIndex = 0;
            for(int i=0; i< nums.length; i++){
                if(nums[i]<0){
                    int temp = nums[i];
                    nums[i] = nums[negativeNumberIndex];
                    nums[negativeNumberIndex] = temp;
                    negativeNumberIndex++;
                }
            }
        }

        public static void partitionZeroAndNonZeros(int[] nums){

        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0){

            }
        }
        }

}
