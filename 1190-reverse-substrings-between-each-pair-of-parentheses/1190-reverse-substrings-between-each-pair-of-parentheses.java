class Solution {
    public String reverseParentheses(String s) {
        StringBuilder str=new StringBuilder();

        Stack<Integer> st=new Stack<>();

        for(int i=0;i<s.length();++i)
        {
           char ch=s.charAt(i);

           if(ch=='(')
           {
            st.push(str.length());
           } else if(ch==')')
           {
                int l= st.pop();
                int r=str.length()-1;
                while(l<r)
                {
                    char t=str.charAt(l);
                    str.setCharAt(l,str.charAt(r));
                    str.setCharAt(r,t);
                    l++;
                    r--;
                }
           }else
           {
            str.append(ch);
           }
        }
        return str.toString();
    }
}