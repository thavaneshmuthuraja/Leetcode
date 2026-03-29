class Solution {
    
    List<List<Integer>>res=new ArrayList<>();

    void func(int []nums,boolean []vis,List<Integer>temp,int n)
    {
        if(temp.size()==n)
        {
            res.add(new ArrayList<>(temp));

        }

        for(int i=0;i<n;i++)
        {
            if(!vis[i])
            {
                vis[i]=true;

                temp.add(nums[i]);

                func(nums,vis,temp,n);

                temp.remove(temp.size()-1);

                vis[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {

        boolean []vis=new boolean [nums.length+1];

        func(nums,vis,new ArrayList<Integer>(),nums.length);

        return res;
        
    }
}