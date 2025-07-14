class Solution {
    public int reverse(int x) {
        boolean neg = false;
        long n = x;

        if (n < 0) {
            neg = true;
            n = n * -1;
        }

        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        s = sb.reverse().toString();

        n = Long.parseLong(s);
        if (neg == true) {
            n = n * -1;
        }

        if (n > Integer.MAX_VALUE || n < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) n;
    }
}
