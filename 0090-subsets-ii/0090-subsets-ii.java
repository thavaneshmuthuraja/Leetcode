import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        return new AbstractList<List<Integer>>() {
            List<List<Integer>> res;
            List<Integer> temp;

            @Override
            public List<Integer> get(int index) {
                if (res == null) {
                    init();
                }
                return res.get(index);
            }

            @Override
            public int size() {
                if (res == null) {
                    init();
                }
                return res.size();
            }

            void init() {
                if (res == null) {
                    res = new ArrayList<>();
                    temp = new ArrayList<>();
                    Arrays.sort(nums);
                    subsetsWithDup(nums, 0);
                }
            }

            void subsetsWithDup(int[] nums, int index) {
                res.add(new ArrayList<>(temp));

                if (index == nums.length) {
                    return;
                }

                for (int i = index; i < nums.length; i++) {
                    if (i > index && nums[i - 1] == nums[i]) {
                        continue;
                    }

                    temp.add(nums[i]);
                    subsetsWithDup(nums, i + 1);
                    temp.remove(temp.size() - 1);
                }
            }
        };
    }
}