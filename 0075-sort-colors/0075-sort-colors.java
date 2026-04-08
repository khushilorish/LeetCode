class Solution {
    public void sortColors(int[] nums) {
        int z=0, o=0, t=0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                z += 1;
            } else if(nums[i] == 1){
                o += 1;
            } else{
                t += 1;
            }
        }

        for(int i =0; i<z; i++){
            nums[i]=0;
        }
        for(int i=z; i<o+z; i++){
            nums[i]=1;
        }
        for(int i=o+z; i<nums.length; i++){
            nums[i]=2;
        }
    }
}