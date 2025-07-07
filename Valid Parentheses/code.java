import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isValid(String s) {
        int i=0;
        Map<Character, Character> brackets = new HashMap<>();
            brackets.put(')', '(');
            brackets.put('}', '{');
            brackets.put(']', '[');
        ArrayList <Character> lastBracket = new ArrayList<>();
        lastBracket.add(s.charAt(0));
        while (i<s.length()-1){
            if (!lastBracket.isEmpty() && lastBracket.get(lastBracket.size()-1)==brackets.get(s.charAt(i+1))){
                lastBracket.remove(lastBracket.size()-1);
            }
            else
            {
                if (s.charAt(i+1)=='(' || s.charAt(i+1)=='{' || s.charAt(i+1)=='[')
                {lastBracket.add(s.charAt(i+1));}
                else
                {return false;}
            }
            i++;
        }
        return lastBracket.isEmpty();
    }
}