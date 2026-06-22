class Solution {

    public boolean func(long s,int x)
    {
         long t=s;
        while(s>=10)
        {
            s/=10;
        }

        return x==(int)s && x==t%10 ? true : false;
    }
    public int countValidSubarrays(int[] nums, int x) {
        long sum=0,c=0; 

        for(int i=0;i<nums.length;i++)
        {
            sum=0;
            for(int j=i;j<nums.length;j++)
            {
                sum+=nums[j];
                if(func(sum,x))c++;
            }
        }

        return (int)c;
    }
}