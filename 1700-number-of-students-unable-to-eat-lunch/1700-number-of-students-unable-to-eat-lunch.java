class Solution {
    public int countStudents(int[] students, int[] arr) {
        int c0 = 0, c1 = 0;
        for(int i:students)
        {
            if(i==0) c0++;
            else c1++;
        }
        for(int i:arr)
        {
            if(i==0)
            {
                if(c0==0) {
                return c1;
                }
                c0--;
            }
            else 
            {
                if(c1==0)
                {
                    return c0;
                }
                c1--;
            }
        }
        return 0;
    }
}