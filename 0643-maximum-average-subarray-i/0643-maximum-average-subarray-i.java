class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Double.NEGATIVE_INFINITY;
        int start = 0;
        int sum =0;

        for(int end=0; end<nums.length; end++){
            sum += nums[end];
            if((end-start+1) == k){
                maxAvg = Math.max(maxAvg, ((double)sum/k));
                sum -= nums[start++];
            }
        }
        return maxAvg;
    }
}