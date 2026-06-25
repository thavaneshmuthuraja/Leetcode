class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> freq=new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
            arr[i]=-1;
        }
        arr=new int[10000];

        for(int v: freq.values())
        {
            if(arr[v]!=0) return false;
            arr[v]=v;
        }
        return true;
    }
}