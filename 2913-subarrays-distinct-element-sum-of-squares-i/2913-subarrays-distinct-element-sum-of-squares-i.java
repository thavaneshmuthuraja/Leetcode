class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans=0;
        for(int i=0;i<nums.size();++i)
        {
            for(int j=i;j<nums.size();j++)
            {
                Map<Integer,Integer> mp=new HashMap<>();
                for(int k=i;k<=j;k++)
                {
                    if(!mp.containsKey(nums.get(k)))
                    {
                        int val=nums.get(k);
                        mp.put(val,1);
                    }
                }
                ans+=(mp.size()*mp.size());
            }
        }
            return ans;
    }
}