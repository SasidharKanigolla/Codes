class Solution {
    public int wateringPlants(int[] arr, int a) {
        int c=0,temp=a;
        for(int i=0;i<arr.length;i++)
        {
            if(a>=arr[i])
            {
                c++;
                a-=arr[i];
            }
            else
            {
                c+=i+i+1;
                a=temp;
                a-=arr[i];
            }
        }
        return c;
    }
}