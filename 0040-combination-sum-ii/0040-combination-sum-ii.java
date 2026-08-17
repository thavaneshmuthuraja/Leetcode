class Solution {

    void func(int in,int []nums,int t,int sum,List<List<Integer>> ans,List<Integer> temp)
    {

        if(t==sum)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(in==nums.length || sum>t) return ;
        for(int i=in;i<nums.length;i++)
        {
            if(i>in && nums[i]==nums[i-1]) continue;
            temp.add(nums[i]);
            func(i+1,nums,t,sum+nums[i],ans,temp);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] nums, int t) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        func(0,nums,t,0,ans,new ArrayList<>());
        return ans;
    }
}