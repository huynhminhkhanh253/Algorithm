class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int count = 0;
        int max = 0;
        // while(j <= s.length()-1){
        //     for(int m = i; m <= j; m++){
        //         if(isVowel(s.charAt(m))){
        //             count++;
        //         }
        //     }
        //     max = Math.max(max, count);
        //     count = 0;
        //     i++;
        //     j++;
        // }
        for(int i = 0; i < k;i++){
            if(vowels.contains(s.charAt(i))){
                count++;
            }
        }
        max = count;
        for(int i = k; i < s.length(); i++){
            if(vowels.contains(s.charAt(i-k))){
                count--;
            }
            if(vowels.contains(s.charAt(i))){
                count++;
            }
            if(max < count){
                max = count;
            }
            //max = Math.max(max, count);
        }
        return max;
    }
}

// a b c i i i d e f

//   i1  i

// count

// t r y h a r d

// 


// Set < > .contains