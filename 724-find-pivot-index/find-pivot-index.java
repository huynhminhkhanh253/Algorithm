class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum = 0;
        int rightsum = 0;
        int totalsum = 0;
        for(int i = 0; i < nums.length; i++){
            totalsum += nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            rightsum = (totalsum - leftsum) - nums[i];
            if(leftsum == rightsum) return i;
            leftsum += nums[i];
        }
        return -1;
    }
}
//   1 6 5 -5 -6

//   i         
//             j

// 1 2 3

// i   j

// 2 1 -1

// i 
// j