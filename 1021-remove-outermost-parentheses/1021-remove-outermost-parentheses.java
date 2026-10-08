class Solution {
    public String removeOuterParentheses(String s) {
        int op=0,in=-1;
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();++i)
        {
            char cur=s.charAt(i);
            if(op==0 && cur=='(') in=i;
            if(op==1 && cur==')')
            {
                str.append(s.substring(in+1,i));
            }
            if(cur==')') op--;
            else op++;
        }
        return str.toString();
    }
}