class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length-1;
        //first ans;
        int ans1=nums[0]*nums[1]*nums[len];
        //case 2;
        int ans2=nums[len]*nums[len-1]*nums[len-2];

        return ans1>=ans2 ? ans1:ans2;
    }
}