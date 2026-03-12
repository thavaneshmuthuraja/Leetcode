class Solution {
    int func(int []arr,int k)
    {

        Map<Integer,Integer> mp=new HashMap<>();

        int st=0,ans=0;

        for(int i=0;i<arr.length;i++)
        {
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);

            while(mp.size()>k)
            {
                mp.put(arr[st],mp.getOrDefault(arr[st],1)-1);

                if(mp.get(arr[st])==0)
                {
                    mp.remove(arr[st]);
                }
                st++;
            }

            ans+=(i-st)+1;
        }
    return ans;

    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return func(nums,k)-func(nums,k-1);
    }
}