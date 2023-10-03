class Solution {
    public int minimumRefill(int[] plants, int a, int b) {
        int c=0;
        int temp1=a,temp2=b;
        int l=0,r=plants.length-1;
        while(l<=r)
        {
            if(l==r)
            {
                if(a>=b)
                {
                    if(a>=plants[l])
                    {
                        a-=plants[l];
                        // a-=plants[l];
                        l++;
                    }
                    else if(plants[l]>a)
                    {
                        // c+=plants[l]-a;
                        c++;
                        a=temp1;
                        a-=plants[l];
                        l++;
                    }
                }
                else
                {
                    if(b>=plants[r])
                    {
                        b-=plants[r];
                        r--;
                    }
                    else if(plants[r]>b)
                    {
                        // c+=plants[r]-a;
                        c++;
                        b=temp2;
                        b-=plants[r];
                        r--;
                    }
                }
                break;
            }
            if(a>=plants[l])
            {
                a-=plants[l];
                l++;
            }
            else if(plants[l]>a)
            {
                // c+=plants[l]-a;
                c++;
                 a=temp1;
                 a-=plants[l];
                l++;
            }
            if(b>=plants[r])
            {
                b-=plants[r];
                r--;
            }
            else if(plants[r]>b)
            {
                // c+=plants[r]-b;
                c++;
                b=temp2;
                b-=plants[r];
                r--;
            }
        }
        return c;
    }
}