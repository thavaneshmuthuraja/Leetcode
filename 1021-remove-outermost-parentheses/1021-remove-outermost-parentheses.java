class Solution {
    public String removeOuterParentheses(String s) {
        Deque<Integer> st=new ArrayDeque<>();
        int op=0;
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();++i)
        {
            char cur=s.charAt(i);
            if(op==0 && cur=='(') st.push(i);
            if(op==1 && cur==')')
            {
                int in=st.pop()+1;
                str.append(s.substring(in,i));
            }
            if(cur==')') op--;
            else op++;
        }
        return str.toString();
    }
}