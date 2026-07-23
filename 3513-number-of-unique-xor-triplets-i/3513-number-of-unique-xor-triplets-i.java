class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        if(nums.length<=2) return nums.length;

        int k=0;
        while(n!=0)
        {
            k++;
            n=n>>1;
        }
        return (int)Math.pow(2,k);
    }
}