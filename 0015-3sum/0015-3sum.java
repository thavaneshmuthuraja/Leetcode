class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>>ans=new ArrayList<>();

        int n=nums.length;

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++)
        {
            int j=i+1,k=n-1;

            if(i!=0 && nums[i-1]==nums[i]) continue;
 
            while(j<k)
            {

                int val=nums[j]+nums[k]+nums[i];

                if(val>0)
                {
                    k--;
                }else if(val<0)
                {
                    j++;
                }else 
                {
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;

                    while(j<k && nums[j-1]==nums[j]) j++;
                    while(j<k && nums[k+1]==nums[k]) k--;
                }
            }
        }

        return ans;
        
    }
}