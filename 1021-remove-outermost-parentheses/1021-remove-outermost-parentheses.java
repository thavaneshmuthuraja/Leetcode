class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans=new StringBuilder("");
        int op=0,cl=0,st=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(') op++;
            if(c==')') cl++;

            ans.append(c);

            if(cl==op)
            {
                op=0;
                cl=0;
                ans.deleteCharAt(st);
                ans.deleteCharAt(ans.length()-1);
                st=ans.length();
            }
        }

        return ans.toString();
        
    }
}