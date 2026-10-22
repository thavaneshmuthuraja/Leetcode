class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> res = new ArrayList<>();
        int[] arr = new int[1001];
        for(int[] i : items1)
            arr[i[0]] += i[1];
        for(int[] i : items2)
            arr[i[0]] += i[1];
        
        for(int i = 0; i < 1001; i++)
            if(arr[i] != 0)
                res.add(List.of(i, arr[i]));
        return res;
    }
}