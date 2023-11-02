class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int[][] mat=new int[grid.length][grid[0].length];
        int n=grid.length; int m=grid[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = 1;
            }
        }
        int mod=12345;
        long pro = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = (int) (mat[i][j] * pro % mod);
                pro = pro * grid[i][j] % mod; 
            }
        }

        pro = 1; 
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                mat[i][j] = (int) (mat[i][j] * pro % mod); 
                pro = pro * grid[i][j] % mod; 
            }
        }
            return mat;
    }
}