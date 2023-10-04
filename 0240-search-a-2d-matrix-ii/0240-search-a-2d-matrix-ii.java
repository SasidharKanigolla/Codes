class Solution {
    public boolean searchMatrix(int[][] mat, int tar) {
        int row=0,col=mat[0].length-1;
        while(row<mat.length&&col>=0)
        {
            if(tar==mat[row][col])
            {
                return true;
            }
            else if(tar>mat[row][col])
            {
                row++;
            }
            else if(tar<mat[row][col])
            {
                col--;
            }
        }
        return false;
    }
}