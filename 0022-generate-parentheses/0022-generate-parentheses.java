class Solution {
    List<String> ans = new ArrayList<>();

    void func(int op, int cp, int n, StringBuilder temp) {
        if (op == cp && cp == n) {
            ans.add(temp.toString());
            return;
        }
        if (op < n) {
            temp.append('(');
            op++;
            func(op, cp, n, temp);
            op--;
            temp.deleteCharAt(temp.length() - 1);
        }
        if (op>cp && cp < n) {
            temp.append(')');
            cp++;
            func(op, cp, n, temp);
            cp--;
            temp.deleteCharAt(temp.length() - 1);
        }
    }

    public List<String> generateParenthesis(int n) {
        func(0, 0, n, new StringBuilder());
        return ans;
    }
}