class Solution {
    public boolean isIsomorphic(String s, String t) {

        Map<Character,Character> mp1=new HashMap<>();
        Map<Character,Character> mp2=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            char ch= s.charAt(i);
            char ch1= t.charAt(i);

            mp1.putIfAbsent(ch,ch1);
            mp2.putIfAbsent(ch1,ch);
            if(mp1.get(ch)!=ch1 || mp2.get(ch1)!=ch) return false;

        }

        return true;
        
    }
}