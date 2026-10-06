class Solution {
    public int minAddToMakeValid(String s) {
            int open =0,ans=0;
        for(char cur:s.toCharArray())
        {
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