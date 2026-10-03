class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();++i)
        {
            char cur=s.charAt(i);
            if(cur==')')
            {
                StringBuilder str=new StringBuilder();
                while(st.peek()!='(')
                {
                    str.append(st.pop());
                }
                st.pop();
                for(int j=0; j<str.length();++j)
                {
                    st.push(str.charAt(j));
                }
            }else
            {
                st.push(cur);
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty())
        {
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}