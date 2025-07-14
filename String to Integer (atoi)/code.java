class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) return 0;

        boolean sign = true;
        int i = 0;
        String s2 = "";

        if (s.charAt(i) == '-') {
            sign = false;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        while (i < s.length() && s.charAt(i) == '0') {
            i++;
        }

        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            s2 = s2 + s.charAt(i);
            i++;
        }

        if (s2.equals("")) return 0;

        try {
            int res = Integer.parseInt(s2);
            if(sign){
                return res;
            }else{
                return -res;
            }
        } catch (Exception e) {
            if (sign){
                return Integer.MAX_VALUE;
            }
            else{
                return Integer.MIN_VALUE;
            }
        }
    }
}
