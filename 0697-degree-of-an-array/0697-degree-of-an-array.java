class Solution {
    class Pair
    {
        int first=0,second=0;
        Pair(int f,int s)
        {
            first=f;
            second=s;
        }
    }
    public int findShortestSubArray(int[] nums) {

        Map<Integer,Pair> mp=new HashMap<>();

        int max=0;

        for(int i=0;i<nums.length;i++)
        {
            if(mp.containsKey(nums[i]))
            {
                Pair temp=mp.get(nums[i]);

                mp.put(nums[i],new Pair(temp.first+1,i));

            }else
            {
                mp.put(nums[i],new Pair(1,i));
            }
            Pair temp=mp.get(nums[i]);

            max=Math.max(temp.first,max);
        }        

        int ans=Integer.MAX_VALUE;


        for(int i=0;i<nums.length;i++)
        {
            Pair temp=mp.get(nums[i]);

            if(max==temp.first )
            {
                ans=Math.min(ans,temp.second-i+1);
                mp.put(nums[i],new Pair(0,temp.second));
            }
        }

        return ans;
    }
}