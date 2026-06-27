class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int j=0; j<n+1; j++){
            int temp = j;
            int count =0;
            while(temp>0){
                if((temp&1) == 1){
                    count++;
                }
                temp >>>= 1;
            }
            ans[j]= count;
        }
        return ans;
    }
}