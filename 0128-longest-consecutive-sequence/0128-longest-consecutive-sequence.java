class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int cur=0,max=0;
        for(int i=1;i<nums.length;++i)
        {
            if(nums[i]==nums[i-1]) continue;
            if(nums[i]-nums[i-1]==1) cur++;
            else cur=0;
            max=Math.max(max,cur);
        }

        return nums.length==0 ? 0:max+1;
    }
}