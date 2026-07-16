class Solution {
   int func(int a,int b)
   {
    while(b!=0)
    {
        int t=a%b;
        a=b;
        b=t;
    }
    return a;
   }
    public long gcdSum(int[] nums) {
        int m=-1;
        int []pre=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            m=Math.max(m,nums[i]);
            pre[i]=func(nums[i],m);
        }
        Arrays.sort(pre);
        long s=0;

        int l=0,r=pre.length-1;
        while(l<r)
        {
            s+=func(pre[l++],pre[r--]);
        }

        return s;
    }
}