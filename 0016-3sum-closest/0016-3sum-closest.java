class Solution {
    public int threeSumClosest(int[] nums, int target) {

            int ans=(int)1e9,n=nums.length,val=-1;

            Arrays.sort(nums);

            for(int i=0;i<n;i++)
            {
                int l=i+1,r=n-1;

                if(i>0 && nums[i]==nums[i-1]) continue;

                while(l<r)
                {
                    int sum=nums[i]+nums[l]+nums[r];

                   if(ans>Math.abs(sum-target))
                   {
                    val=sum;
                    ans=Math.abs(sum-target);
                   }

                    if(target>sum)
                    {
                        l++;
                    }else if(target<sum)
                    {
                    
                        r--;
                    }
                    else 
                    {
                        l++;
                        r--;
                        while(l<r && nums[l]==nums[l-1]) l++;
                        while(l<r && nums[r]==nums[r-1]) r--;
                    }
                }
            }

        
        
           return val;
    }
}