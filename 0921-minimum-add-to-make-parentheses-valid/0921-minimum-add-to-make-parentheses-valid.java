class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> st=new ArrayDeque<>();

        for(int i=0;i<s.length();++i)
        {
            char cur=s.charAt(i);
            if(cur=='(') st.push(cur);
            else{
                if(!st.isEmpty() && st.peek()=='(') st.pop();
                else  st.push(cur);
            }
        }
        return st.size();
    }
}