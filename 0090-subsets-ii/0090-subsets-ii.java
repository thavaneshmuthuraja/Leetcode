class Solution {
    List<List<Integer>> res=new ArrayList<>();

    void func(int in,int []nums,List<Integer> temp)
    {
        res.add(new ArrayList<>(temp));

        for(int i=in;i<nums.length;i++)
        {
            if(i>in && nums[i]==nums[i-1]) continue;
            temp.add(nums[i]);
            func(i+1,nums,temp);
            temp.remove(temp.size()-1);
        }        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        func(0,nums,new ArrayList<>());
        return res;
    }
}