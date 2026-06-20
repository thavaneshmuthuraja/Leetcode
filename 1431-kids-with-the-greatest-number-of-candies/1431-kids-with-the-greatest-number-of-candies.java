class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int ex) {
        List<Boolean> ans=new ArrayList<>();
        int m=-1;

        for(int i=0;i<candies.length;i++)
        {
            m=Math.max(candies[i],m);
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+ex>=m)
            {
                ans.add(true);
            }else
            {
                ans.add(false);
            }
        }

        return ans;
    }
}