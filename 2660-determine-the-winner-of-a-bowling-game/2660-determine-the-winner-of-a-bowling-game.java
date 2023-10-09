class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int a=0,b=0,n=player1.length;
        for(int i=0;i<n;i++)
        {
            if(i>0&&(player1[i-1]==10)||i>1&&(player1[i-2]==10))
            {
                a+=(2*player1[i]);
            }
            else
            {
                a+=player1[i];
            }
            if(i>0&&(player2[i-1]==10)||i>1&&(player2[i-2]==10))
            {
                b+=(2*player2[i]);
            }
            else
            {
                b+=player2[i];
            }
        }
        if(a>b) return 1;
        if(a<b) return 2;
        return 0;
    }
}