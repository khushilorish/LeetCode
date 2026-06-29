class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count =0;
        for(int i=left; i<=right; i++){
            int c =0;
            int num =i;
            while(num!=0){
                num &= (num-1);
                c++;
            }
            boolean b = true;
            for(int j=2; j<= Math.sqrt(c); j++){
                if(c%j == 0){
                    b = false;
                }
            }
            if(c==1){
                b = false;
            }
            if(b){
                count++;
            }
        }
        return count;
    }
}