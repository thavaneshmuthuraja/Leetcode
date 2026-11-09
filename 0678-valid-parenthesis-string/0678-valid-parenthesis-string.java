class Solution {
    public boolean checkValidString(String s) {
        int min=0,max=0;
        for(int i=0;i<s.length();++i)
        {
            char cur=s.charAt(i);
            if(cur=='(')
            {
                min++;
                max++;
            }else if(cur=='*')
            {
                min--;
                max++;
            }else 
            {
                min--;
                max--;
            }
            if(min<0) min=0;
            if(max<0) return false;
        }
        return min == 0 ? true : false; 
    }
}