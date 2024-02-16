class Solution {
    public String mergeAlternately(String word1, String word2) {
       StringBuilder result =  new StringBuilder();
       int i = 0;
       int j = 0;
       while(i < word1.length() && j < word2.length()){
           result.append(word1.charAt(i));
           result.append(word2.charAt(j));
           i++;
           j++;
       }
       for(int i1 = i; i1 < word1.length(); i1++){
           result.append(word1.charAt(i1));
       }
       for(int j2 = i; j2 < word2.length(); j2++){
           result.append(word2.charAt(j2));
       }
       return result.toString();
    } 
}