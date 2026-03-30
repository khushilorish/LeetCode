class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;

        for(int weight: weights){
            low = Math.max(low, weight);
            high += weight;
        }

        while(low<=high){
            int mid = low + (high-low)/2;
            int w=0;
            int day=1;

            for(int weight: weights){
                if(w+weight > mid){
                    day += 1;
                    w =0;
                }
                w += weight;
            }
            if(day>days){
                low = mid+1;
            } else{
                high = mid-1;
            }
        }
        return low;
    }
}