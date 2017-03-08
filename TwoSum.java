// Two Sum - LeetCode

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i =0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] result = new int[2];
        while(true){
            int current = nums[i];
            int desired = target - current;
            if(map.containsKey(desired)){
                result[0] = map.get(desired);
                result[1] = i;
                return result;
            }
            map.put(current,i);
            i++;
        }
    }
}
