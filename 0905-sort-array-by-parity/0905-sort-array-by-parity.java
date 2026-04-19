class Solution {

    public void swap(int in1,int in2,int []nums)
    {
        int t=nums[in1];
        nums[in1]=nums[in2];
        nums[in2]=t;
    }
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length,even=0,odd=n-1;
    while(even<odd)
    {
       while(even<odd && nums[even]%2==0)
       {
        even++;
       }

       while( even<odd && nums[odd]%2==1)
       {
        odd--;
       }

       if(even>=odd) break;

       swap(even,odd,nums);
       even++;
       odd--;
       

    }
    return nums;
    }
    
}