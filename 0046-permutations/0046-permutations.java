class Solution {
    
    List<List<Integer>>res=new ArrayList<>();

    void func(int []nums,Map<Integer,Boolean>vis,List<Integer>temp,int n)
    {
        if(temp.size()==n)
        {
            res.add(new ArrayList<>(temp));

        }

        for(int i=0;i<n;i++)
        {
            if(!vis.getOrDefault(nums[i],false))
            {
                vis.put(nums[i],true);

                temp.add(nums[i]);

                func(nums,vis,temp,n);

                temp.remove(temp.size()-1);

                vis.put(nums[i],false);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {

        Map<Integer,Boolean>vis=new HashMap<>();

        func(nums,vis,new ArrayList<Integer>(),nums.length);

        return res;
        
    }
}