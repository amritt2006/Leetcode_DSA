class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int nc = Integer.MIN_VALUE;
        int n = candies.length;
        List<Boolean> result = new ArrayList<>();
        for(int i = 0; i<n; i++){
            if(candies[i]>nc){
                nc = candies[i];
            }
        }
        for(int i = 0; i<n; i++){
            if((candies[i]+extraCandies)>=nc){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}