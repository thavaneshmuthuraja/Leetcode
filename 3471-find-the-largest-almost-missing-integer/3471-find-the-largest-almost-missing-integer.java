class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        int []freq= new int [51];
        int max=0;
            for(int i=0;i<n;i++)
            {
                freq[nums[i]]++;
               
            }

            int res=-1;

            for(int i=0;i<n;i++)
            {
                if(freq[nums[i]]==1) res=Math.max(res,nums[i]);
                 max=Math.max(nums[i],max);
            }

            if(k==1) return res;
            else if(k==n) return max;
            else {
                    if(freq[nums[0]]==1 && freq[nums[n-1]]==1) return Math.max(nums[0],nums[n-1]);
                    else if(freq[nums[0]]==1 && freq[nums[n-1]]!=1) return nums[0]; 
                    else if(freq[nums[0]]!=1 && freq[nums[n-1]]==1) return nums[n-1];
                    else return -1; 
            }
    }
}