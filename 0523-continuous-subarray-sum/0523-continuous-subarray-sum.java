class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        Map<Integer,Integer> mp=new HashMap<>();

        int pre=0,n=nums.length,cnt=0;

        mp.put(0,-1);

        if(n==1) return false;

        for(int i=0;i<n;i++)
        {
            pre+=nums[i];

            if(mp.getOrDefault(pre%k,-2)==-2)
            {
                mp.put(pre%k,i);
            }else
            {
                int val=mp.get(pre%k);
                if(i-val>=2) return true;
            }
        }
        return false;
    }
}