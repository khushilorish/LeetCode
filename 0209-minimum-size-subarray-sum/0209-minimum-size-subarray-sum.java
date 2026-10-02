class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int wsum = 0;
        int start = 0;

        for(int end = 0; end<nums.length; end++){
            wsum += nums[end];
            
            while(wsum>= target){
                minLength = Math.min(minLength, end-start+1);
                wsum -= nums[start];
                start++;
            }
        }

        return minLength==Integer.MAX_VALUE ? 0 : minLength;
    }
}