class Solution {

    List<List<String>> ans = new ArrayList<>();

    void backtrack(int index, String s, List<String> temp) {

        // We reached the end
        if (index == s.length()) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        // Try every possible substring
        for (int end = index; end < s.length(); end++) {

            // Only choose palindrome
            if (isPalindrome(s, index, end)) {

                // CHOOSE
                temp.add(s.substring(index, end + 1));

                // EXPLORE
                backtrack(end + 1, s, temp);

                // UNDO
                temp.remove(temp.size() - 1);
            }
        }
    }

    boolean isPalindrome(String s, int left, int right) {

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public List<List<String>> partition(String s) {

        backtrack(0, s, new ArrayList<>());

        return ans;
    }
}