class Solution {
    public void sortColors(int[] nums) {

        int zero=0,ones=0,twos=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) zero++;

            if(nums[i]==1) ones++;

            if(nums[i]==2) twos++;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(zero!=0) {
                nums[i]=0;
                zero--;
                continue;
            }
            if(ones!=0) {
                nums[i]=1;
                ones--;
                continue;
            }
            if(twos!=0) {
                nums[i]=2;
                twos--;
                continue;
            }
        }
        
    }
}