class Solution {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int n=intervals.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(intervals[0][1]);
        for(int i=1;i<n;++i)
        {
            if(pq.peek()<intervals[i][0])
            {
                pq.poll();
                pq.add(intervals[i][1]);
            }else
            {
                pq.add(intervals[i][1]);
            }
        }

        return pq.size();
    }
}