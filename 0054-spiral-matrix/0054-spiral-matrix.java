class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int n=mat.length,m=mat[0].length;//n=rows,m=colums
        int up=0,ri=m-1,dow=n-1,le=0;
        List<Integer> arr = new ArrayList<>();
        while(true)
        {
                    for(int j=le;j<=ri;j++)
                    {
                        arr.add(mat[up][j]);
                    }
                    up++;
            if(le>ri||up>dow) break;
            
                for(int i=up;i<=dow;i++)
                {
                    arr.add(mat[i][ri]);
                }
                ri--;
            
            if(le>ri||up>dow) break;
            
                    for(int j=ri;j>=le;j--)
                    {
                        arr.add(mat[dow][j]);
                    }
                    dow--;        
            
            if(le>ri||up>dow) break;
            
                for(int i=dow;i>=up;i--)
                {
                    arr.add(mat[i][le]);
                }
                le++;
            
            if(le>ri||up>dow) break;
        }
        return arr;
    }
}