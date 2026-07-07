class Solution {
    public long sumAndMultiply(int n) {
        long sum=0,ans=0;
        int st=0;
        String str=String.valueOf(n);
        while(st<str.length())
        {
            long v=str.charAt(st)-'0';
            if(v!=0)
            {
                ans=ans*10+v;
                sum+=v;
            }
            st++;
        }
        return ans*sum;
    }
}