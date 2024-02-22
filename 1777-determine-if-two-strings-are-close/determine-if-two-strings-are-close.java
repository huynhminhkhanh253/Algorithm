class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for(char c : word1.toCharArray()){
            freq1[c - 'a']++;
            set1.add(c);
        } 
        for(char c : word2.toCharArray()){
            freq2[c - 'a']++;
            set2.add(c);
        }
        if(isEquals(freq1, freq2) && set1.equals(set2)){
            return true;
        }
        else return false;
        //return isEquals(freq1, freq2);
    }
    private boolean isEquals(int[] freq1,int[] freq2){
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        return Arrays.equals(freq1, freq2);
    }
}

 /* 
    c a b b b a
a : 2 
b : 3 
c : 1

    a b b c c c 
a : 1
b : 2
c : 3 

0 1 2     3

a b c ... z

0 0 0     0



*/