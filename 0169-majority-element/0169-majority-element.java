class Solution {
    public int majorityElement(int[] nums) {
        int c=0,val=0;

        for(int i=0;i<nums.length;i++)
        {
            if(c==0)
            {
                val=nums[i];
            }

            if(val!=nums[i])
            {
                c--;
            }else {
                c++;
            }
        }

        return val;
        
    }
}