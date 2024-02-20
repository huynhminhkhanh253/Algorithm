class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while(left < right){
            max = Math.max(max, (right-left)*Math.min(height[left], height[right]));
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }   
        }
        return max;
    }
}

// 0 1 2 3 4 5 6 7 8
   

// 1 8 6 2 5 4 8 3 7

//   i             j

//

