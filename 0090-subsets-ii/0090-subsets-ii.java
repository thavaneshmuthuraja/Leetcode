class Solution {
    List<List<Integer>> res1=new ArrayList<>();
    Set<List<Integer>> res=new HashSet<>();

    void func(int in,ArrayList<Integer>temp,int []nums)
    {
        if(in==nums.length)
        {
            //System.out.println(temp.get(0));
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        temp.add(nums[in]);

        //System.out.println(temp.get(0));

        func(in+1,temp,nums);
        temp.remove(temp.size()-1);
        func(in+1,temp,nums);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        func(0,new ArrayList<>(),nums);

        for(List<Integer> t:res)
        {
            res1.add(t);
        }
    return res1;
        
    }
}