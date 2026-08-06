class Solution {
    public int smallestNumber(int n, int t) {
        if(n<t) n=t;
        int last_di=1,temp=n;

        temp/=10;
        while(temp!=0)
        {
            last_di*=(temp%10);
            temp/=10;
        }
        int last=n%10;
        for(int i=last;i%10!=0;i++)
        {
            
            if((last_di*i)%t==0) return n;
            n++;
        }
        return n;
    }
}