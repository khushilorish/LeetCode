class Solution {
    public int maximumWealth(int[][] accounts) {
        int rich = 0;

        for(int i=0; i<accounts.length;i++){
            int curr =0;
            for(int j=0; j<accounts[i].length;j++){
                curr += accounts[i][j];
            }
            if(curr>rich){
                rich = curr;
            }
        }
        return rich;
    }
}