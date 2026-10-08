class Solution {
    public String removeOuterParentheses(String s) {
        int op=0,in=-1;
        StringBuilder str=new StringBuilder();
        for(char cur:s.toCharArray())
        {
            if(cur=='(')
            {
                if(op>0) str.append(cur);
                op++;
            }
            if(cur==')')
            {
                op--;
                if(op>0) str.append(cur);
            }
        }
        return str.toString();
    }
}