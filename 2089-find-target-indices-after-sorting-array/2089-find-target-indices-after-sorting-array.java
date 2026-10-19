class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans=new ArrayList<>();
        int freq=0,pos=0;
        for(int i=0;i<nums.length;++i)
        {
            if(nums[i]<target) pos++;
            if(nums[i]==target) freq++;
        }
        for(int i=1;i<=freq;i++)
        {
            ans.add(pos++);
        }
        return ans;
    }
}