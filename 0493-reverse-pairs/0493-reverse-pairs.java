class Solution {


    long ans=0;
    
     void merge(int []arr,int low ,int mid,int high)
    {
        int j=mid+1,i=low,k=0;
        ArrayList<Integer> temp=new ArrayList<>();
        while(i<=mid && j<=high)
        {
            if(arr[i]<=arr[j])
            {
                temp.add(arr[i++]);
            }else if(arr[i]>arr[j])
            {
                temp.add(arr[j++]);
            }
        }
        
        while(i<=mid)
        {
            temp.add(arr[i++]);
        }
        while(j<=high)
        {
            temp.add(arr[j++]);
        }
        for(k=0;k<temp.size();k++)
        {
            arr[low+k]=temp.get(k);
        }
    }
    
     void algo(int [] arr,int low,int mid,int high)
    {
        int i=low,j=mid+1;
        
        while(i<=mid && j<=high)
        {
            if((long)arr[i]>(2L*arr[j]))
            {
                ans+=(mid-i+1);
                j++;
            }else
            {
                i++;
            }
        }
        
    }
    
     void mergesort(int []arr,int low,int high)
    {
        if(low>=high) return ;
        int mid=(low+high)/2;
        
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        
        algo(arr,low,mid,high);
        
        merge(arr,low,mid,high);
    }
    
    public int reversePairs(int[] arr) {

        mergesort(arr,0,arr.length-1);
        
        return (int)ans;

    }
}