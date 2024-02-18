class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowelsSet = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        //Set<Character> vowels = new HashSet<>(chars);
        int start = 0;
        int end = s.length() - 1;
        char[] s1 = s.toCharArray();
        while(start < end){
            while(start < end && vowelsSet.contains(s1[start]) == false){
                start++;
            }
            while(start < end && vowelsSet.contains(s1[end]) == false){
                end--;
            }
            char temp = s1[start];
            s1[start] = s1[end];
            s1[end] = temp; 
            start++;
            end--;
        }
        String answer = new String(s1);
        return answer;
    }
}