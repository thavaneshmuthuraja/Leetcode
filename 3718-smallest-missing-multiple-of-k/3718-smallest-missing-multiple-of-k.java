class Solution {
    public int missingMultiple(int[] nums, int k) {
        int []freq=new int [201];
        for(int i=0;i<nums.length;++i)
        {
            freq[nums[i]]++;
        }
        int i=1,res=k;
        while(freq[res]!=0)
        {
            res=i*k;
            i++;
        }
        return res;        
    }
}