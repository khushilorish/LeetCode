class Solution {
    public boolean hasAlternatingBits(int n) {
        while(n!=0){
            int m = (n>>1);
            if((m&1) == (n&1)){
                return false;
            }
            n >>= 1;
        }
        return true;
    }
}