class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2];
        int[] mask = new int[n+1];

        for(int i=0; i<n; i++){
            mask[nums[i]]++;
        }

        for(int i=0; i<=n; i++){
            if(mask[i]==2){
                ans[0]= i;
            }
            if(mask[i]==0){
                ans[1] = i;
            }
        }
        return ans;
    }
}