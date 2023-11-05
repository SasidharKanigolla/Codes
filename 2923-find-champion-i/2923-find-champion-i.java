class Solution {
   public int findChampion(int[][] grid) {
    int n = grid.length;

    for (int i = 0; i < n; i++) {
        boolean isChampion = true;
        for (int j = 0; j < n; j++) {
            if (i != j && grid[j][i] == 1) {
                isChampion = false;
                break;
            }
        }

        if (isChampion) {
            return i;
        }
    }

    return -1; // Dummy return statement
}
    
}