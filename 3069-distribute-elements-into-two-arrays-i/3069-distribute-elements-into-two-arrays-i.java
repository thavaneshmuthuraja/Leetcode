class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int []arr1=new int[n];
        int []arr2=new int [n];
        int in1=0,in2=0;
        arr1[in1]=nums[0];
        arr2[in2]=nums[1];

        for(int i=2;i<n;i++)
        {
            if(arr1[in1]>arr2[in2])
            {
                arr1[++in1]=nums[i];
            }else
            {
                arr2[++in2]=nums[i];
            }
        }
        for(int i=0;i<=in2;i++)
        {
            arr1[++in1]=arr2[i];
        }
        return arr1;
    }
}