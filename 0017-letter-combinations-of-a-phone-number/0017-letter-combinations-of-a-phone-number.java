class Solution {
    List<String> ans=new ArrayList<>();

    void func(int in,StringBuilder temp,Map<Integer,String> mp,int n,String di)
    {
        if(in==n)
        
        {
            ans.add(temp.toString());
            return;
        }
        int val=di.charAt(in)-'0';

        String cur=mp.get(val);

        for(int i=0;i<cur.length();i++)
        {
            char t=cur.charAt(i);
            temp.append(String.valueOf(t));
            func(in+1,temp,mp,n,di);
            temp.deleteCharAt(temp.length()-1);
        }

    }

    public List<String> letterCombinations(String di) {
        Map<Integer,String> mp=new HashMap<>();
        mp.put(2,"abc");
        mp.put(3,"def");
        mp.put(4,"ghi");
        mp.put(5,"jkl");
        mp.put(6,"mno");
        mp.put(7,"pqrs");
        mp.put(8,"tuv");
        mp.put(9,"wxyz");
        int len=di.length();
        func(0,new StringBuilder(),mp,len,di);
        return ans;
    }
}