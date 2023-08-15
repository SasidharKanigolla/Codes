//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution
{
    public:
    //Function to find a continuous sub-array which adds up to a given number.
    vector<int> subarraySum(vector<int>arr, int n, long long s)
    {
        // Your code here
        if(s==0) return {-1};
        int a=0,i=0,sum=0,c=0;
        while(i<=n)
        {
            if(sum==s)
            {
                // ar.add(a+1);
                // ar.add(i);
                return {a+1,i};
            }
            else if(sum>s)
            {
                sum=sum-arr[a];
                a++;
            }
            else if(sum<s)
            {
            sum+=arr[i];
            i++;
            }
        }
        // if(sum>s)
        //     {
        //         while(a<n){
        //             if(sum==s)
        //     {
        //         // ar.add(a+1);
        //         // ar.add(i);
        //         return {a+1,i};
        //     }
        //     else if(sum>s)
        //     {
        //         sum=sum-arr[a];
        //         a++;
        //     }
        //     else{
        //         return {-1};
        //     }
        //         }
        //     }
        
        return {-1};
    }
};

//{ Driver Code Starts.

int main()
 {
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        long long s;
        cin>>n>>s;
        vector<int>arr(n);
        // int arr[n];
        const int mx = 1e9;
        for(int i=0;i<n;i++)
        {
            cin>>arr[i];
        }
        Solution ob;
        vector<int>res;
        res = ob.subarraySum(arr, n, s);
        
        for(int i = 0;i<res.size();i++)
            cout<<res[i]<<" ";
        cout<<endl;
        
    }
	return 0;
}
// } Driver Code Ends