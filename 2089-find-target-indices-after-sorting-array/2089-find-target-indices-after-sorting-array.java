class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int ti = 0;
        int eq = 0;
        for(int i =0;i < nums.length;i++){
            if(nums[i] < target){
           ti++;
            }else if(nums[i]== target){
           eq++;
            }}
          
          List<Integer> list = new ArrayList<>();
       for(int j =0;j < eq;j++){
        list.add(ti++);
       }
        return list;
    }
}