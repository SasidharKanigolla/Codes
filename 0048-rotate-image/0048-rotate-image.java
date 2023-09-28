class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int a=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=a;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n/2;j++)
            {
                
                int b=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=b;
                // a++;

                
            }
        }
    }
}