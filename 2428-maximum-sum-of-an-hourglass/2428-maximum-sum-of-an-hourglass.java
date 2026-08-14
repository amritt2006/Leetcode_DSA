class Solution {
    public int maxSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int maxsum = Integer.MIN_VALUE;
        if(row<3 || col<3){
            return -1;
        }
        for(int i = 0; i<row-2; i++){
            for(int j = 0; j<col-2; j++){
                int currsum = grid[i][j]+grid[i][j+1]+grid[i][j+2]+grid[i+1][j+1]+grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2];
                maxsum=Math.max(maxsum,currsum);
            }
        }
        return maxsum;
    }
}