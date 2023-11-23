class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr = sentence.split(" ");
        if(arr[0].charAt(0)!=arr[arr.length-1].charAt(arr[arr.length-1].length()-1))
        {
            return false;
        }
        char prev= arr[0].charAt(arr[0].length()-1);
        for(int i=1;i<arr.length;i++)
        {
            if(prev==arr[i].charAt(0))
            {
                prev=arr[i].charAt(arr[i].length()-1);
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}