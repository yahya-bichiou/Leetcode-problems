class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = strs[0];
        StringBuilder sb;
        int found = 0, i=0;
        while (!res.isEmpty() && found!=strs.length && i<strs.length){
            if (res.length()<=strs[i].length() && strs[i].substring(0,res.length()).equals(res))
            {
                found++;
                i++;
            }
            else
            {
                found=0;
                sb = new StringBuilder(res);
                sb.deleteCharAt(res.length()-1);
                res = sb.toString();
                i=0;
            }
        }
        return res;
    }
}