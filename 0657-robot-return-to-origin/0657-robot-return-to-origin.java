class Solution {
    public boolean judgeCircle(String moves) {
        int arr[][] = new int[1][2];
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='U')
            {
                arr[0][0]++;
            }
            else if(moves.charAt(i)=='D')
            {
                arr[0][0]--;
            }
            else if(moves.charAt(i)=='L')
            {
                arr[0][1]--;
            }
            else if(moves.charAt(i)=='R')
            {
                arr[0][1]++;
            }
        }
        if(arr[0][0]==0&&arr[0][1]==0) return true;
        return false;
    }
}