class Solution {
    public int findKthPositive(int[] arr, int k) {

        int l=0,h=arr.length-1;

        //if(arr[0]>k) return k;

        while(l<=h)
        {
            int mid=(l+h)/2;
            int mis=arr[mid]-(mid+1);

            if(mis<k)
            {
                l=mid+1;
            }else
            {
                h=mid-1;
            }
        }
        //int rem=k-(arr[h]-(h+1));
        //if(rem==0) return arr[arr.length-1]+k;
        //because low is just one index forward so that we use 
        return l+k;
    }
}