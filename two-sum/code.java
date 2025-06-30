class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=0;
        boolean found = false;
        int[] res = new int[2];
        do{
            j=i+1;
            do{
                if (nums[i]+nums[j]==target)
                {
                    res[0]=i;
                    res[1]=j;
                    found = true;
                }
                j++;
            }while (!found && j<nums.length);
            i++;
        }while (!found);
        return (res);
    }
}