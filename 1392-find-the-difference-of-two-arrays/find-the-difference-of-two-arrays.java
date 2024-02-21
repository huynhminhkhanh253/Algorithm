class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for(int num1 : nums1){
            set1.add(num1);
        }
        Set<Integer> set2 = new HashSet<>();
        for(int num2 : nums2){
            set2.add(num2);
        }
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<Integer>());
        answer.add(new ArrayList<Integer>());
        for(int num : set1){
            if(!set2.contains(num)) answer.get(0).add(num);
        }
        for(int num : set2){
            if(!set1.contains(num)) answer.get(1).add(num);
        }
        return answer;
    }
}