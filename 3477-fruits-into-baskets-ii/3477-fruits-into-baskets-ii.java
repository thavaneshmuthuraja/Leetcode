class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int ans=0;
        boolean []find=new boolean [1000];
        for(int i=0;i<fruits.length;i++)
        {
            int j=0;
            for( j=0;j<baskets.length;j++)
            {

                if(!find[j] && fruits[i]<=baskets[j]) {
                    find[j]=true;
                    break;
                }
            }
            if(!find[j]) ans++; 
        }
        return ans;
    }
}