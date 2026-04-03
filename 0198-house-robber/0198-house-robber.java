class Solution {
    public int rob(int[] nums) {
        int sum1 =0;
        int sum2 =0;
        for(int num: nums){
            int curr = Math.max(sum1, sum2 +num);
            sum2 = sum1;
            sum1 = curr;
        }
        return sum1;
    }
}