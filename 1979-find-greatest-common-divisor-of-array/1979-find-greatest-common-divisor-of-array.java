class Solution {
    public int findGCD(int[] nums) {
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int ans = 1;
        for(int i = 0; i<nums.length; i++){
            large = Math.max(nums[i],large);
            small = Math.min(nums[i],small);
        }
        for(int i = 1; i<nums.length; i++){
            ans = gdc(small,large);
        }
        return ans;
    }
    public static int gdc(int a,int b){
            while(b!=0){
                int rem = a%b;
                a = b;
                b = rem;
            }
            return a;
    }
}