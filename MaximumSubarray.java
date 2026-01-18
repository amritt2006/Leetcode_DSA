public class MaximumSubarray {
    public int maxSubArray(int[] nums){
        int maxSoFar = nums[0];
        int currentSum = 0;
        for (int n : nums) {
            currentSum += n;
            if (currentSum > maxSoFar) {
                maxSoFar = currentSum;
            }if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSoFar;
    }
}  
