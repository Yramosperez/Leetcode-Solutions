import java.util.HashMap;
import java.util.Map;

class Solution {
    // Time complexity: O(n) where n is the number of elements in the array
    // Space complexity: O(n) due to the additional storage used by the hashmap
    public int[] twoSum(int[] nums, int target) {
        // Create a hashmap to store the value and its index
        Map<Integer, Integer> map = new HashMap<>();
        
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // Current value
            int cur = nums[i];
            // Find the complement that adds up to the target
            int complement = target - cur;
            
            // If the complement is found in the hashmap, return the indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Store the current value and its index in the hashmap
            map.put(cur, i);
        }
        
        // Return null if no solution is found
        return null;
    }
}