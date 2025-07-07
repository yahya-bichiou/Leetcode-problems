class Solution {
    public boolean isPalindrome(int x) {
        String s1,s2="";
        s1=Integer.toString(x);
        int i=s1.length()-1;
        while(i>=0){
            s2 = s2 + s1.charAt(i);
            System.out.println(s2);
            i--;
        }
        return s1.equals(s2);
    }
}