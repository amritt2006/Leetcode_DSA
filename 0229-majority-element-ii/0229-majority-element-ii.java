class Solution {
    public List<Integer> majorityElement(int[] nums) {

        // Final answer store karne ke liye ArrayList banayi
        List<Integer> list = new ArrayList<>();

        // Array ka total size
        int n = nums.length;

        // HashMap mein har element ki frequency store karenge
        // Key   = Array ka element
        // Value = Us element ki frequency (kitni baar aaya hai)
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: HashMap mein sabhi elements ki frequency count karna
        for(int i = 0; i < n; i++) {

            // Check karna ki current element pehle se HashMap mein present hai ya nahi
            if(map.containsKey(nums[i])) {

                // Agar element present hai, toh uski frequency 1 se increase kar do
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else {

                // Agar element pehli baar mila hai, toh uski frequency 1 set kar do
                map.put(nums[i], 1);
            }
        }

        // Step 2: HashMap ki saari unique keys (elements) nikalna
        Set<Integer> keys = map.keySet();

        // Step 3: HashMap ke har unique element ko traverse karna
        for(int key : keys) {

            // Check karna ki element ki frequency n/3 se greater hai ya nahi
            if(map.get(key) > n/3) {

                // Agar condition satisfy hoti hai, toh element answer mein add kar do
                list.add(key);
            }
        }

        // Saare majority elements return kar do
        return list;
    }
}