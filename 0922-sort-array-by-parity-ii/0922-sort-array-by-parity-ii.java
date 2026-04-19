class Solution {
    public void func(int in1,int in2,int []nums)
    {
        int t=nums[in1];
        nums[in1]=nums[in2];
        nums[in2]=t;
    }
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length, odd=1,even=0;

        Arrays.sort(nums);

        while(even<nums.length && odd<nums.length)
        {
             while( even<n && nums[even]%2==0 )
             {
                even+=2;
             }
             
             while(odd<n && nums[odd]%2==1)
             {
                odd+=2;
             }

             if(even>=nums.length || odd>=nums.length) break;
             func(even,odd,nums);
        
        }

        return nums;
    }
}