class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb =  new StringBuilder();
        for(int i = s.length()-1; i >=0 ; i--){
            int temp = i;
            while(i >= 0 && s.charAt(i) != ' '){
                i--;
            }
            String words = s.substring(i+1, temp+1);
            if(words == "") continue;
            sb.append(words + " ");
            
                
        }
        return sb.toString().trim();

    }

    // " the sky is blue " 
    // "the sky is blue  "trim"
    //  the sky is blue
    // i
    //               temp 
    //   


}