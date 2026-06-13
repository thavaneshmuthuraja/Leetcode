class Solution {
    public int myAtoi(String s) {

        s=s.strip();

        StringBuilder ans=new StringBuilder();

        boolean pos=true;

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='-' && i==0){
                pos=false;
                continue;
            }
            if(ch=='+' && i==0) continue;
            if(ch>='0' && ch<='9')
            {
                ans.append(ch);
            }else
            {
                break;
            }
        }

        long val=0,cnt=0;

        for(int i=ans.length()-1;i>=0;i--)
        {
            val+=(ans.charAt(i)-'0')*Math.pow(10,cnt++);
        }

        if(!pos)
        {
            val=-val;
        }

        if (val > 2147483647) return 2147483647;
        if (val < -2147483648) return -2147483648;
        return (int)val;
    }
}