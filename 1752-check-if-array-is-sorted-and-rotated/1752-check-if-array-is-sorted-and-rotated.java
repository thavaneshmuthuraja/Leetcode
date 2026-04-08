class Solution {
    public boolean check(int[] nums) {

        int n=nums.length-1,c=0;

        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                if(nums[0]<nums[n]) return false;
                c++;
            }
        }
        return c==1||c==0;
        
    }
}