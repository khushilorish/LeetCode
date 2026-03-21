class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int s=0,e=nums.length-1;
        while(s<e){
            int m = s+(e-s)/2;
            if(nums[e]<nums[m]){
                s = m+1;
            } else {
                e = m;
            }
        }
        return nums[e];
    }
}