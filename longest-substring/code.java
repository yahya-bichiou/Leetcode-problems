import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();   //using HashSet to remove doubles
        int right, left = 0;

        for (right = 0; right < n; right++) {

            //if char not in the set it adds it
            if (!charSet.contains(s.charAt(right)))
            {
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            }

            //if char exists it removes all the chars from left until we reach the existing letter
            else
            {
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }

                //adds the char on the right
                charSet.add(s.charAt(right));
            }
        }

        return maxLength;
    }
}