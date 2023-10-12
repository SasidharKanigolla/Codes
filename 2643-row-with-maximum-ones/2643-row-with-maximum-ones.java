class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] arr = new int[2];
        int ind=0,temp=0,c=-1;
        for(int i=0;i<mat.length;i++)
        {
            temp=0;
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==1) temp++;
            }
            if(temp>c)
            {
                c=temp;
                ind =i;
            }
        }
        arr[0]=ind;
        arr[1]=c;
        return arr;
    }
}