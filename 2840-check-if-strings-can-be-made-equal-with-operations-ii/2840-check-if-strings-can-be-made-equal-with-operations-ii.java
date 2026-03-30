class Solution {

    boolean func(String s1,String s2)
    {
        int n=s1.length(),m=s2.length();

        Map<Character,Integer>odd=new HashMap<>();
        Map<Character,Integer>even=new HashMap<>();

        for(int i=0;i<m;i++)
        {
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);

            if(i%2==0)
            {
                even.put(ch1,even.getOrDefault(ch1,0)+1);
                even.put(ch2,even.getOrDefault(ch2,0)-1);
            }else 
            {
                odd.put(ch1,odd.getOrDefault(ch1,0)+1);
                odd.put(ch2,odd.getOrDefault(ch2,0)-1);

            }
        }

        for(int val: even.values())
        {
            if(val!=0) return false;
        }

        for(int val: odd.values())
        {
            if(val!=0) return false;
        }

        return true;
    }
    public boolean checkStrings(String s1, String s2) {

        return func(s1,s2);
        
    }
}