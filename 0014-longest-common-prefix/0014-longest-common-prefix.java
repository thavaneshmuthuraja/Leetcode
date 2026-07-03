class Solution {
    public String longestCommonPrefix(String[] strs) {

        int len=(int)1e9;
        for(int i=0;i<strs.length;i++)
        {
            int cnt=0;
            for(cnt=0;cnt<strs[i].length()&&cnt<strs[0].length();cnt++)
            {
                char c=strs[i].charAt(cnt);
                char ch=strs[0].charAt(cnt);
                if(c!=ch) break;
            }
            len=Math.min(len,cnt);
        }

        len=len==(int)1e9 ? 0:len;

        return strs[0].substring(0,len);
    }
}