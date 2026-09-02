class Solution {
    List<List<Integer>> ans=new ArrayList<>();

    void func(int in,int n,int k,ArrayList<Integer> temp)
    {
        if(k==temp.size())
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=in+1;i<=n;i++)
        {
            temp.add(i);
            func(i,n,k,temp);
            temp.remove(temp.size()-1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        func(0,n,k,new ArrayList<>());
        return ans;
    }
}