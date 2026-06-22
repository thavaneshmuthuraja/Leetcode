class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer>mp=new HashMap<>();

        int m=(int)1e9;

        for(int i=0;i<text.length();i++)
        {
            mp.put(text.charAt(i),mp.getOrDefault(text.charAt(i),0)+1);
        }

        String t="balon";

        for(int i=0;i<t.length();i++)
        {
            char c=t.charAt(i);
            if(c=='l'||c=='o'){
            m=Math.min(m,mp.getOrDefault(c,0)/2);
            }
            else {
                m=Math.min(m,mp.getOrDefault(c,0));
            }

        }


        return m;
    }
}