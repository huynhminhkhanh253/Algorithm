class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(int[] row : grid){
            hashMap.put(Arrays.toString(row), hashMap.getOrDefault(Arrays.toString(row), 0)+1);
        }
        int count = 0;
        for(int j = 0; j < n; j++){
            int[] col = new int[n];
            for(int i = 0; i < n; i++){
                col[i] = grid[i][j];
            }
            count += hashMap.getOrDefault(Arrays.toString(col),0);
        }
        return count;
    }
}

/* 

row     3 2 1 2
        1 4 4 5
        2 4 2 2
        2 4 2 2

3 2 1 2 : 1 
1 4 4 5 : 1
2 4 2 2 : 2





3 1 2 2
1 4 4 5
2 4 2 2
2 4 2 2

 */