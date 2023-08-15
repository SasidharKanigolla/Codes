class Solution {
    public boolean areNumbersAscending(String s) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i=0,n=s.length();
        while(i<n)
        {
            // if(Character.isDigit(s.charAt(i)))
            // {
            //     arr.add(s.charAt(i)-'0');
            // }
            int temp=0;
            while(i<n && '0' <= s.charAt(i) && s.charAt(i) <= '9' ) {
                temp=(temp*10)+s.charAt(i)-'0';
                i++;
            }
            if(temp!=0){

            arr.add(temp); 
            } 
            i++;
        }
        for(i=0;i<arr.size()-1;i++)
        {
            if(arr.get(i)>=arr.get(i+1))
            {
                return false;
            }
        }
        return true;
    }
}