class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int altitude = 0;
        for(int i = 0; i < gain.length; i++){
            altitude += gain[i];
            if(max < altitude) max = altitude;
        }
        return max;
    }
}
//   -5  1  5  0  -7

//                  i
// 0 -5 -4  1  1  -6
      
//    max

//    