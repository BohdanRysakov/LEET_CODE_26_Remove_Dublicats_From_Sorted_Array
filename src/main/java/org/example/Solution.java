package org.example;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int k =1;
        int currentUnique = 0;
        int indexToChange = -1;
        for (int i = 1,j=1; i < nums.length; i++) {
            if(nums[currentUnique+1]>nums[currentUnique]){
                currentUnique++;
                j++;
                continue;
            }
            if(nums[j] <= nums[currentUnique] && indexToChange==-1){
                indexToChange = j;
                j++;
                k =j-1;
            }
            else if(nums[i]> nums[currentUnique] && indexToChange!=-1){
                nums[indexToChange] = nums[i];
                currentUnique = indexToChange;
                indexToChange =-1;
                i--;
                k++;
            }



        }

        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] >= nums[i+1]) {
                return i+1;
            }

        }
        return nums.length;
    }
}
