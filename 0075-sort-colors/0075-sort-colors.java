class Solution {

    void swap(int a,int b,int []nums)
    {
        int t=nums[a];
        nums[a]=nums[b];
        nums[b]=t;
    }
    public void sortColors(int[] nums) {

    int low =0,hi=nums.length-1;

        for(int i=0;i<=hi;i++)
        {
            //low zone i met low then put low zone

            if(nums[i]==0) 
            {
                swap(i,low,nums);

                low++;
            }
            //high zone i met put high zone;
            if(nums[i]==2) 
            {
                swap(i,hi,nums);
                hi--;
                //i--;
            }

          }
        
    }
}