class Solution {
    public double calculateTax(int[][] arr, int income) {
        if(income==0)
        {
            return 0;
        }
        int n=arr.length,temp=1,i;
        double sum=0;
        sum=sum+(arr[0][0]*(double)arr[0][1]/100);
        income=income-arr[0][0];
        if(n==1||income<0)
        {
            if(income<0)
            {
                income=arr[0][0]+income;
                sum=income*(double)arr[0][1]/100;
            }
            return sum;
        }
        for(i=1;i<n;i++)
        {
            temp=arr[i][0]-arr[i-1][0];
            income=income-temp;
            if(income<0)
            {
                income=temp+income;
                sum+=income*(double)arr[i][1]/100;
                break;
            }
            sum=sum+(temp*(double)arr[i][1]/100);
        }
        return sum;
    }
}