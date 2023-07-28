# Leet Code 26 Remove Duplicates from Sorted Array
## Task level - *Easy*

--------------
Solution uses 0(1) extra memory and changes array in-place

```Java
        int k =1;
        int currentUniqueIndex = 0;
        int indexToChange = -1;
        for (int i = 1,j=1; i < nums.length; i++) {
            if(nums[currentUniqueIndex+1]>nums[currentUniqueIndex]){
                currentUniqueIndex++;
                j++;
                continue;
            }
            if(nums[j] <= nums[currentUniqueIndex] && indexToChange==-1){
                indexToChange = j;
                j++;
                k =j-1;
            }
            else if(nums[i]> nums[currentUniqueIndex] && indexToChange!=-1){
                nums[indexToChange] = nums[i];
                currentUniqueIndex = indexToChange;
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

```