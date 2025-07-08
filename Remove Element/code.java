class Solution {
    public int removeElement(int[] nums, int val) {
        List <Integer> finalList = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            finalList.add(nums[i]);
        }
        while (finalList.contains(val))
        {
            finalList.remove(finalList.indexOf(val));
        }
        for(int i=0; i<finalList.size(); i++){
            nums[i]= finalList.get(i);
        }
        return finalList.size();
    }
}