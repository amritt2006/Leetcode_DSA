class Solution {
    public boolean checkDivisibility(int n) {
        int num = n;
        int sum = 0;
        int mul = 1;
        while(num>0){
            int temp = num % 10;
            sum = sum + temp;
            mul = mul*temp;
            num = num/10;
        }
        int total = sum + mul;
        if(n%total != 0){
            return false;
        }
        return true;
    }
}