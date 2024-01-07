class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int j = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
                if(count < 2){
                    nums[j] = nums[i];
                    j++;
                }
            }
            else{
                count = 0;
                nums[j] = nums[i];
                j++; 
            }
        }
        return j ;
    }
}

/* [1,1,1,2,2,3]
              i 
            j 
   [1,1,2,2,3,3]  */


