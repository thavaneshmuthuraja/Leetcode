class Solution {
    public boolean uniformArray(int[] nums1) {

        int odd=Integer.MAX_VALUE,eve=Integer.MAX_VALUE;

        Arrays.sort(nums1);

        for(int i=0;i<nums1.length;i++)
        {
            if((nums1[i]&1)==0)
            {
                eve=Math.min(eve,nums1[i]);
            }else
            {
                odd=Math.min(odd,nums1[i]);
            }
        }


        if(odd==Integer.MAX_VALUE || eve==Integer.MAX_VALUE) return true;

        System.out.println(odd+"\n"+eve);

        for(int i=0;i<nums1.length;i++)
        {
            if(nums1[i]>=odd) break;
            if((odd-nums1[i])%2==0) return true;
        }

        for(int i=0;i<nums1.length;i++)
        {
            if(nums1[i]>=eve) break;
            if((eve-nums1[i])%2==1) return true;
        }

        return false;
    }
}