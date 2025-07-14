class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder[] s1 = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            s1[i] = new StringBuilder();
        }

        int n = 0;
        boolean dir = false;

        for (int i = 0; i < s.length(); i++) {
            s1[n].append(s.charAt(i));

            if (n == 0 || n == numRows - 1) {
                dir = !dir;
            }

            if (dir) {
                n++;
            } else {
                n--;
            }
        }

        String res = "";
        for (int i = 0; i < numRows; i++) {
            res += s1[i].toString();
        }

        return res;
    }
}
