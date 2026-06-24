class NumArray {

    int []tree;
    int size;


    public NumArray(int[] nums) {
        int n=nums.length;
        size=2;
        while(size<n) size*=2;
        tree=new int [2*size];

        for(int i=0;i<n;i++)
        {
            tree[i+size]=nums[i];
        }

        for(int i=size-1;i>=1;i--)
        {
            tree[i]=tree[i*2]+tree[(i*2)+1];
        }
    }
    
    public void update(int index, int val) {
        int idx=index+size;
        tree[idx]=val;
        while(idx>1)
        {
            idx>>=1;
            tree[idx]=tree[idx*2]+tree[(idx*2)+1];
        }
        
    }
    
    public int sumRange(int left, int right) {
        int l=left+size;
        int r=right+size;
        int s=0;
        while(l<=r)
        {
            if((l&1)==1) s+=tree[l++];
            if((r&1)==0) s+=tree[r--];
            l>>=1;
            r>>=1;
        }

        return s;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */