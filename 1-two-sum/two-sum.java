class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            numMap.put(nums[i], i);
        }
        for(int i = 0 ; i < nums.length; i++){
            int compliment = target - nums[i];
            if(numMap.containsKey(compliment) && numMap.get(compliment) != i){
                return new int[]{numMap.get(compliment), i};
            }
        }
        return new int[2];
    }

}

// 2 7 11 15

// 
 
// k = 9