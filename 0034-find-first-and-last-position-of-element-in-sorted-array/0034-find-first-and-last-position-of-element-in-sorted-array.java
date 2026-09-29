class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = firstPos(nums, target);
        ans[1] = lastPos(nums, target);

        return ans;
    }

    private int firstPos(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;
        int ans = -1;

        while(s<=e){
            int mid = s + (e-s)/2;

            if(nums[mid] == target){
                e = mid-1;
                ans = mid;
            }else if(nums[mid] > target){
                e = mid-1;
            }else{
                s = mid+1;
            }

        }
        return ans;
        
    }

    private int lastPos(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;
        int ans = -1;

        while(s<=e){
            int mid = s + (e-s)/2;

            if(nums[mid] == target){
                s = mid+1;
                ans = mid;
            }else if(nums[mid] > target){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return ans;
        
    }

}