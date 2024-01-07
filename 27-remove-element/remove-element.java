class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length-1;
        int sum = 0;
        while(i <= j){
            if(nums[i] == val){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
                sum += 1;
            }
            else{
                i++;
            }
        }
    return nums.length - sum;
    }
}
