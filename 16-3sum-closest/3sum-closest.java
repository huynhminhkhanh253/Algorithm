class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        
        for(int i = 0; i < nums.length; i++){
            int k = i+1;
            int m = nums.length - 1;
            while(k < m){
                int sum = nums[i] + nums[m] + nums[k];
                if(Math.abs(target - sum) < Math.abs(target- closestSum)){
                    closestSum = sum;
                }
                if(sum < target){
                    k++;
                }
                else{
                    m--;
                }
            }
        }
                
        return closestSum;
    }
}

// -1 2 1 -4

// -4 1 1 2

//  i   k m

// 1 2 3 4 5 

// i   k   m   target 10 abs(target - sum) < target