class Solution {
    public int islandPerimeter(int[][] arr) {
        int n=arr.length,m=arr[0].length;
        int[][] temp = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int c=0;
                if(arr[i][j]==1)
                {
                    if(j>0&&(arr[i][j]==1&&arr[i][j-1]==1))
                    {
                        c++;
                    }
                    if(i>0&&(arr[i][j]==1&&arr[i-1][j]==1))
                    {
                        c++;
                    }
                    if(j<m-1&&(arr[i][j]==1&&arr[i][j+1]==1))
                    {
                        c++;
                    }
                    if(i<n-1&&(arr[i][j]==1&&arr[i+1][j]==1))
                    {
                        c++;
                    }
                     temp[i][j]=4-c;
                }
            }
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                ans+=temp[i][j];
            }
        }
        return ans;
    }
}