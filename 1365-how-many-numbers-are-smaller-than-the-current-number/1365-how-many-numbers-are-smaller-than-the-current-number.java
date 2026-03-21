class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int small=0;
        for(int i=0;i<nums.length;i++){
            small =0;
            for(int j=0; j<nums.length;j++){
                if(nums[i]>nums[j]){
                    small +=1;
                }
            }
            ans[i] = small;
        } 
        return ans;
    }
}