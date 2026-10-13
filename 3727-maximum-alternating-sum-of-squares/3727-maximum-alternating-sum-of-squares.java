class Solution {
    public long maxAlternatingSum(int[] nums) {
        long sum=0;
        int n=nums.length;
        for(int i=0;i<n;++i)
        {
            nums[i]=Math.abs(nums[i]);
        }

        Arrays.sort(nums);

        int l=0,r=n-1;
        boolean turn=true;

        while(l<=r)
        {
            if(turn){
                sum+=(nums[r]*nums[r]);
                r--;
                turn=false;
            }else
            {
                sum-=(nums[l]*nums[l]);
                l++;
                turn=true;
            }
        }
        return sum;
    }
}