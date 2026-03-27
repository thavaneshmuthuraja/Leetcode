class Solution {

    void func(int in,List<Integer>temp,int []nums,List<List<Integer>> res)
    {
        if(in==nums.length)
        {
            if(!res.contains(temp))
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        temp.add(nums[in]);

        func(in+1,temp,nums,res);

        temp.remove(temp.size()-1);

        func(in+1,temp,nums,res);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();

        func(0,new ArrayList<>(),nums,res);
        return res;
        
    }
}