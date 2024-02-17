class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int gdc = gdc(str1.length(), str2.length());
        return str1.substring(0, gdc);
    }
    private int gdc(int a, int  b){   
        if(b == 0){ 
            return a;
        }
        else return gdc(b, a % b); 
    }
}

///

