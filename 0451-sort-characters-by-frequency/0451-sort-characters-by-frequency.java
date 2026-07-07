
class Pair{
    int val;
    char ch;
    Pair(char c,int v)
    {
        ch=c;
        val=v;
    }

    void inc()
    {
        val++;
    }
}
class Solution {
    public String frequencySort(String s) {

        Map<Character,Pair> mp=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            char t=s.charAt(i);
            mp.putIfAbsent(t,new Pair(t,0));
            mp.get(t).inc();
        }

        Pair [] arr=new Pair[mp.size()];
        int i=0;
        for(char k:mp.keySet())
        {
            arr[i++]=mp.get(k);
        }
        Arrays.sort(arr,(a,b)->{ return Integer.compare(b.val,a.val); });
        StringBuilder ans=new StringBuilder();
        for( i=0;i<arr.length;i++)
        {
            
            char t=arr[i].ch;
            int len=arr[i].val;
            for(int j=0;j<len;j++)
            {
                ans.append(t);
            }
        }
        return ans.toString();
         
    }
}