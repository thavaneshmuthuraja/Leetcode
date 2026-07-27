class Solution {
    public int maxProduct(int[] nums) {
        int m1=Integer.MIN_VALUE,m2=m1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=m1)
            {
                m2=m1;
                m1=nums[i];
            }else
            {
                m2=Math.max(nums[i],m2);
            }
        }
        return (m1-1)*(m2-1);
    }
}