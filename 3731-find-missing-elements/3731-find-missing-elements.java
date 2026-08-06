class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int val=nums[0];
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i=i+0)
        {
            if(nums[i]!=val) ans.add(val++);
            else {
            val++;
            i++;
            }
        }
        return ans;
    }
}