class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        //return new int[1];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < asteroids.length; i++){
            // asteroid[i] > 0
            if(stack.isEmpty() || asteroids[i] > 0){
                stack.push(asteroids[i]);
            }
            // asteroid[i] < 0
            else{
                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroids[i])){
                    stack.pop();
                }
                if(!stack.isEmpty() && stack.peek() == Math.abs(asteroids[i])){
                    stack.pop();
                }
                else if(stack.isEmpty() || stack.peek() < Math.abs(asteroids[i])){
                    stack.push(asteroids[i]);
                }         
            }
        }
        int[] result = new int[stack.size()];
        for(int i = stack.size() - 1; i >= 0; i--){
            result[i] = (stack.pop());
        }
        return result;
    }
}

//
// 5 10  -5 11 -6
// i
// stack: 


// [-2,-1,1,2]