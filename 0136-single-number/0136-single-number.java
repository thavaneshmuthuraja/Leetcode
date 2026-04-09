class Solution {
    public int singleNumber(int[] nums) {
        int val=0;

        for(int v:nums)
        {
            val^=v;
        }

        return val;
    }
}