
class DSU{
    int []par;
    DSU(int n)
    {
        par=new int [n];
        for(int i=0;i<n;i++)
        {
            par[i]=i;
        }
    }

    int find(int rep)
    {
        if(rep==par[rep])
        {
            return rep;
        }
        return par[rep]=find(par[rep]);
    }

    void unite(int x,int y)
    {
        int repx=find(x);
        int repy=find(y);
        par[repy]=repx;
    }
}

class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String,Integer>mp= new HashMap<>();
        int n=accounts.size();
        DSU obj=new DSU(n);

        for(int i=0;i<accounts.size();i++)
        {
            for(int j=1;j<accounts.get(i).size();j++)
            {
                
                if(mp.putIfAbsent(accounts.get(i).get(j),i)!=null)
                {
                    obj.unite(mp.get(accounts.get(i).get(j)),i);
                }
            }
        }

        Map<Integer,List<String>>mp1=new HashMap<>();

        for(String str: mp.keySet())
        {
            int rep=mp.get(str);
            
            int repMail=obj.find(rep);
            mp1.putIfAbsent(repMail,new ArrayList<>());
            mp1.get(repMail).add(str);
            mp1.put(repMail,mp1.get(repMail));
        }

        List<List<String>> ans=new ArrayList<>();
    

        for(int rep:mp1.keySet())
        {
            List<String> temp=mp1.get(rep);
            Collections.sort(temp);

            List<String> val=new ArrayList<>();
            val.add(accounts.get(rep).get(0));
            val.addAll(temp);
            ans.add(val);
        }

        return ans;


    }
}