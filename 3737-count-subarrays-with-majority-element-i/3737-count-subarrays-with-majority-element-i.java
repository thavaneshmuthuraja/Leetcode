class Solution {
    public int countMajoritySubarrays(int[] nums, int t) {
        Map<Integer,Integer> mp=new HashMap<>();
        int cnt=0;

        for(int i=0;i<nums.length;i++)
        {
            mp.clear();
            for(int j=i;j<nums.length;j++)
            {
                mp.put(nums[j],mp.getOrDefault(nums[j],0)+1);
                if(mp.getOrDefault(t,0)>(j-i+1)/2) cnt++;
            }
        }

        return cnt;
    }
}