class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int arrays = 0;
        int start = 0;
        int sum =0;
        
        for(int end=0; end<arr.length; end++){
            sum += arr[end];
            if((end-start+1) == k){
                if(sum/k >= threshold){
                    arrays += 1;
                }
                sum -= arr[start++];
            }
        }
        return arrays;
    }
}