class Solution {
    public void moveZeroes(int[] nums) {
        int j = 1;
        int i = 0;
        
        while(j < nums.length ){
            if(nums[i] == 0 && nums[j] != 0 && nums.length > 1){
                swap(i,j,nums);
            }
            if(nums[i] != 0) i++;
            j++;
            
        }
    }
    private void swap(int a, int b, int[] nums){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}

// 1 0 0 3 12
//   i 
//       j

// 0,1,0,3,12
