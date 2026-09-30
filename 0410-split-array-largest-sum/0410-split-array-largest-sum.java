class Solution {
    public int splitArray(int[] nums, int k) {
        int s = 0;
        int e = 0;

        // calculate start and end
        for(int num: nums){
            s = Math.max(num, s);
            e += num;
        }

        // Binary Search
        while(s<e){
            int m = s + (e-s)/2;

            // calculate pieces
            int sum =0;
            int pieces = 1;
            for(int num: nums){
                if((sum+num) > m){
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }

            if(pieces > k){
                s = m+1;
            }else{
                e = m;
            }
        }

        return s;
    }
}