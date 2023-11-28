class Solution {
    public int strStr(String s, String p) {
        if(!s.contains(p)) return -1;
        return s.indexOf(p);
    }
}