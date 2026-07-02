class Solution {
    public String reverseWords(String s) {

        int end = s.length() - 1;
        StringBuilder ans = new StringBuilder();

        while (end >= 0) {
            char c = s.charAt(end);
            if (c == ' ') {
                int t = end + 1;

                if (t < s.length() && s.charAt(t) != ' ') {
                    ans.append(' ');
                }

                while (t < s.length() && s.charAt(t) != ' ') {
                    char ch = s.charAt(t);
                    ans.append(ch);
                    t++;
                }
            }
            end--;

        }
        int t=++end;

        if (t < s.length() && s.charAt(t) != ' ') {
            ans.append(' ');
        }

        while (t < s.length() && s.charAt(t) != ' ') {
            char ch = s.charAt(t);
            ans.append(ch);
            t++;
        }

        ans.deleteCharAt(0);
        return ans.toString();
    }
}