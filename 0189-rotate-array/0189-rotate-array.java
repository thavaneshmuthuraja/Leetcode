class Solution {
    void func(int []nums,int st,int end)
    {
        while(st<end)
        {
           int t= nums[st];
           nums[st]=nums[end];
           nums[end]=t;
           st++;
           end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;

        func(nums,0,nums.length-1-k);
        func(nums,nums.length-k,nums.length-1);
        func(nums,0,nums.length-1);
    }
}