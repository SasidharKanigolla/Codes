class Solution {
    public int beautifulSubstrings(String s, int k) {
        int counte = 0;
        int len = s.length();
        
        for (int i = 0; i < len; i++) {
            int vow = 0;
            int con = 0;
            
            for (int j = i; j < len; j++) {
                char c = s.charAt(j);
                
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vow++;
                }
                
                int df = j - i + 1;
                con = df - vow;
                
                if (vow == con && (vow * con) % k == 0) {
                    counte++;
                }
            }
        }
        
        return counte;
    }
}

