class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        for(int i= 0; i<n; i++){
            if(s.charAt(i)=='*'){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        while (!st.isEmpty()){
            ans.append(st.pop());
        }  

       return ans.reverse().toString();
    }
}