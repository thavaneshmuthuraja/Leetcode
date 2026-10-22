class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> ans=new ArrayList<>();
        TreeMap<Integer,Integer> mp=new TreeMap<>();

        for(int i=0;i<items1.length;++i)
        {
            int v=items1[i][0];
            int w=items1[i][1];
            mp.put(v,mp.getOrDefault(v,0)+w);
        }
        for(int i=0;i<items2.length;++i)
        {
            int v=items2[i][0];
            int w=items2[i][1];
            mp.put(v,mp.getOrDefault(v,0)+w);
        }

        for(int k:mp.keySet())
        {
            ans.add(new ArrayList<>(Arrays.asList(k,mp.get(k))));
        }
        return ans;
    }
}