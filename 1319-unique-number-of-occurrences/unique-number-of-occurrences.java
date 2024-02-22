class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> occur = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            occur.put(arr[i], occur.getOrDefault(arr[i],0) + 1);
        }
        Set<Integer> s =  new HashSet<>(occur.values());
        return occur.size() == s.size(); 
    }
}

///

/* 
    1 : 3
    2 : 2
    3 : 1

   


 */

