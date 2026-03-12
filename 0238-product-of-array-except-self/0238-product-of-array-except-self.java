class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n=nums.length;
        int []prefix=new int [n];
        prefix[0]=nums[0];
        int []sufix=new int [n];
        sufix[n-1]=nums[n-1];
        int []res=new int [n];

        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]*nums[i];
        }

        for(int i=n-2;i>=1;i--)
        {
            sufix[i]=sufix[i+1]*nums[i];
        }

        for(int i=0;i<n;i++)
        {
            if(i==0) res[i]=sufix[i+1];
            else if(n-1==i) res[i]=prefix[i-1];
            else {
                res[i]=prefix[i-1]*sufix[i+1];
            }
        }

        return res;
    }
}