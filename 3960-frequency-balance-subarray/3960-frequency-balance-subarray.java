class Solution {
    public int getLength(int[] nums) {

        int ans=0;

        for(int i=0;i<nums.length;i++)
        {
            Map<Integer,Integer>mp=new  HashMap<>();
            int []cntfreq=new int [nums.length+1];
            Arrays.fill(cntfreq,0);
            int activefreq=0,maxfreq=0;

            for(int j=i;j<nums.length;j++)
            {
                int f=mp.getOrDefault(nums[j],0);
                if(f>0)
                {
                    cntfreq[f]--;
                    if(cntfreq[f]==0)activefreq--;
                }
                mp.put(nums[j],++f);
                if(cntfreq[f]==0)activefreq++;
                cntfreq[f]++;

                maxfreq=Math.max(maxfreq,f);

                if(mp.size()==1)
                {
                    ans=Math.max(ans,j-i+1);
                    
                }

                if(activefreq==2 && (maxfreq&1)==0 && (cntfreq[maxfreq]+cntfreq[maxfreq/2])==mp.size())
                {
                    ans=Math.max(ans,j-i+1);
                }

            }

        }

        return ans;
        
    }
}