class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        result[nums.length-1] = 1;
        int multi = 1;
        for(int i = 1; i < result.length; i++){
            multi *= nums[i-1];
            result[i] = multi; 
        }
        multi = 1;
        for(int i = result.length -2; i >= 0 ; i--){
            multi *= nums[i+1];
            result[i] *= multi; 
        }
        return result;
    }
}
//          i   2
//      1   2   3  4 
// res  1   1   2  6
// res 24   12  4  1


// pre 1    2   6  24  
// suf 24   24  12 4