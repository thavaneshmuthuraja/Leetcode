class Solution {
    public int subarraySum(int[] nums, int k) {
        
        Map<Integer,Integer> mp=new HashMap<>();

        int c=0,pre=0;

        mp.put(0,1);

        for(int i=0;i<nums.length;i++)
        {
            pre+=nums[i];

            mp.put(pre,mp.getOrDefault(pre,0)+1);

           int val= mp.getOrDefault(pre-k,0);

            if(val!=0) c+=val; 

        }

        return c;

    }
}