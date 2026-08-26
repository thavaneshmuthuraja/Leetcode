class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int st = 0, end = 0, o_cnt = 0;
        int i = 0, j = s.length() - 1;
        boolean f=false;
        while (end < s.length()) {
            char t = s.charAt(end);
            if (t == '1')
                o_cnt++;
            while (o_cnt >= k) {
                char tc = s.charAt(st);
                if (o_cnt == k) {
                    String t1 = s.substring(st, end + 1);
                    String t2 = s.substring(i, j + 1);
                    if (((end - st) < (j - i))) {
                        i = st;
                        j = end;
                    } else if ((end - st) == (j - i)) {

                        if (t1.compareTo(t2) < 0) {
                            i = st;
                            j = end;
                        }
                    }
                    f=true;

                }
                if (tc == '1') {
                    o_cnt--;
                }
                st++;
            }

            end++;
        }

        if (!f && (j - i + 1) == s.length())
            return "";

        return s.substring(i, j + 1);
    }
}