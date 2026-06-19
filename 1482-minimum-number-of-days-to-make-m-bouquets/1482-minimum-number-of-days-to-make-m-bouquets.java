class Solution {
    public boolean canMake (int[] bloomDay, int m, int k , int n )
    {   int ans = 0 ; int count = 0 ;
        for( int i =0 ; i  < bloomDay.length ; i++){
           if( bloomDay[i] <= n ){
            count++;
           }else {
            ans+= count/k;
            count = 0;
           }

        }

        ans+= count/k;

        if(ans >= m )return true ;
        return false ;
        
    }
    public int minDays(int[] bloomDay, int m, int k) {
        

        if( bloomDay.length < m*k)return -1 ;
       
       int high = bloomDay[0] ;
       int low = bloomDay[0] ;

       for( int i =0 ; i < bloomDay.length ; i++){
           low = Math.min(low , bloomDay[i]);
            high = Math.max(high , bloomDay[i]);
       }

        int ans = -1 ;
       while( low <= high ){
            int mid = low + ( high  - low )/2 ;

            if( canMake(bloomDay , m , k , mid )){
                ans = mid ;
                high = mid - 1 ;
            }else {
                low = mid + 1 ;
            }
       }

        return ans ;

        

    }
}