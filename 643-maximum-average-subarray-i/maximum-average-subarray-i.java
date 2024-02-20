class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0;
        int j = k;
        int ave = 0;
        int sum = 0;
        int presum = 0;
        for(int q = 0; q < k; q++){
            sum += nums[q];
        }
        presum = sum;
        while(j < nums.length){
            sum -= nums[i++];
            
            sum += nums[j++];
            
            
            if(sum > presum){
                presum = sum;
            }
        }
        return (double)presum/k;
    }
}

/// 1 12 -5 -6 50 3

///    i          j