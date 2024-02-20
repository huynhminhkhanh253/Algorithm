class Solution {
    public int maxOperations(int[] nums, int k) {
        int i = 0;
        int j = nums.length - 1;
        int count = 0;
        Arrays.sort(nums);
        while(i < j){
            if(nums[i] + nums[j] == k){
                count++;
                i++;
                j--;
            }
            else if(nums[i] + nums[j] > k){
                j--;
            }
            else{
                i++;
            }
        }
        return count;
    }
}

/// 1 2 3 3 4 5 

///   i 

///          j