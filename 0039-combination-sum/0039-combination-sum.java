class Solution {
    List<List<Integer>> ans=new ArrayList<>();

    void func(int []cad,int in,List<Integer>temp,int t,int s)
    {
        if(cad.length==in)
        {
            if(s==t)
            {
                ans.add(new ArrayList<>(temp));
            }
            return;
        }

        if(s>t) return;
        temp.add(cad[in]);
        func(cad,in,temp,t,s+cad[in]);
        temp.remove(temp.size()-1);
        func(cad,in+1,temp,t,s);
    }
    public List<List<Integer>> combinationSum(int[] cad, int t) {
        List<Integer> temp=new ArrayList<>();
        func(cad,0,temp,t,0);

        return ans;
    }
}