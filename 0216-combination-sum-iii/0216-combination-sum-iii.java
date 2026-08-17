class Solution {
    List<List<Integer>> res=new ArrayList<>();
    void func(int in,int k,int n,int s,List<Integer>temp)
    {
        if(temp.size()==k && s==n)
        {
            res.add(new ArrayList<>(temp));
        }
        if(s>n || in==10) return;
        for(int i=in;i<10;i++)
        {
            temp.add(i);
            func(i+1,k,n,s+i,temp);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        func(1,k,n,0,new ArrayList<>());
        return res;
    }
}