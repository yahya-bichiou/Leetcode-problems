import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int removeDuplicates(int[] nums) {
        int k,i;
        Set <Integer> finalSet = new HashSet<>();
        for(i=0; i<nums.length; i++){
            finalSet.add(nums[i]);
        }
        List<Integer> finalList = new ArrayList<>(finalSet);
        Collections.sort(finalList);
        for(i=0; i<finalList.size(); i++){
            nums[i]= finalList.get(i);
        }
        k = finalList.size();
        return k;
    }
}