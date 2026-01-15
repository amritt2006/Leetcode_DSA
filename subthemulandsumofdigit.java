public class subthemulandsumofdigit{
    public int subtractProductAndSum(int n) {
        int i, mul, sum, ans;
        mul=1;
        sum=0;
        String str = String.valueOf(n);
        for(i=0;i<str.length();i++){
            int digit = str.charAt(i)-'0';
            mul*=digit;
            sum+=digit;           
        }
        return mul-sum;
    }
}    