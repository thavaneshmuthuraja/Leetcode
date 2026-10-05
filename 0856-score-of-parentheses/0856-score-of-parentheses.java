class Solution {

    int i=0;
    public int func(int in,String s)
    {
        int cur=0;
        for(i=in;i<s.length();++i)
        {
            char c=s.charAt(i);
            
            if(c==')')
            {
                break;
            }else
            {
                cur+=func(i+1,s);
            }
        }
        
        if(cur==0) return 1;
        return cur*2;
    }
    public int scoreOfParentheses(String s) {
        int ans=0;
        for(i=0;i<s.length();++i)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                ans+=func(i+1,s);
            }
        }   
        return ans;
    }
}