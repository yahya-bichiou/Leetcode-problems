import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        int res = 0, i=0;
        Map<Character, Integer> dataMap = new HashMap<>(); //map of the roman letter and the according value
            dataMap.put('I', 1);
            dataMap.put('V', 5);
            dataMap.put('X', 10);
            dataMap.put('L', 50);
            dataMap.put('C', 100);
            dataMap.put('D', 500);
            dataMap.put('M', 1000);
        while (i<s.length()-1){
            if (dataMap.get(s.charAt(i))<dataMap.get(s.charAt(i+1)))
            {
                res+=(dataMap.get(s.charAt(i+1))- dataMap.get(s.charAt(i)));
                i+=2;
            }
            else
            {
                res+=dataMap.get(s.charAt(i));
                i++;
            }
        }
        if (i<s.length()){
            res+=dataMap.get(s.charAt(s.length()-1));
        }
        return res;
    }
}