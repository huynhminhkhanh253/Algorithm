class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s == null) return false;
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        int i = 0;
        int j = 0;
        while(j < t1.length && i < s1.length){
            if(t1[j] == s1[i]) i++;
            j++;
        }
        if(i == s1.length){
            return true;
        }
        else return false;
    }
}

// a h b g d c  (t )

// j

// a c b  (s )

// i 