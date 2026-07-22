class Solution {
    public int jump(int[] nums) {
        int count=0,max=0,threshold=0;
        if(nums.length==1) return 0;
        for(int i=0;i<nums.length-1;i++){
            max=Math.max(max,nums[i]+i);
            if(threshold==i){
                count++;
                threshold=max;
            }
        }
        return count;
    }
}