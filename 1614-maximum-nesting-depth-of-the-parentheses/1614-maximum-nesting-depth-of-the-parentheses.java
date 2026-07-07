class Solution {
    public int maxDepth(String s) {
        int op=0,ans=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(') op++;
            else if(c==')')op--;
            ans=Math.max(ans,op);
        }
        return ans;
    }
}