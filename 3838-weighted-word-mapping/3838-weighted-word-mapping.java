class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

        StringBuilder ans=new StringBuilder();

        for(String str: words)
        {
            int sum=0;
            for(char ch:str.toCharArray())
            {
                 sum+=weights[ch-'a'];
            }
            sum=sum%26;
            ans.append((char)(25-sum+'a'));
        }

        return ans.toString();
    }
}