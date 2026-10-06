class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> st=new ArrayDeque<>();
            int open =0,ans=0;
        for(int i=0;i<s.length();++i)
        {
            char cur=s.charAt(i);
            if(cur=='(') open++;
            else 
            {
                if(open>0) open--;
                else ans++;
            }
        }
        return open+ans;
    }
}