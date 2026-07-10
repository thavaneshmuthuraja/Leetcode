class Solution {
    int st = 0, end = 1, ans = 0;

    void func(int l, int r, String s) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        --r;
        l++;
        if (ans < (r - l)) {
            ans = (r - l);
            st = l;
            end = r + 1;
        }
    }

    public String longestPalindrome(String s) {
         if(s.length()==1) return s;
        for (int i = 0; i < s.length(); i++) {
            if ((i - 1) >= 0 && (i + 1) < s.length() && s.charAt(i - 1) == s.charAt(i + 1)) {
                func(i - 1, i + 1, s);
            } 
            if ((i + 1) < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                func(i, i + 1, s);
            }
        }
        return s.substring(st, end);
    }
}