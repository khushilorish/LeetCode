class Solution {
    public int countNegatives(int[][] a) {
        int j = a[0].length-1;
        int i= 0;
        int sum =0;

        while(j>=0 && i<a.length){
            int num = a[i][j];
            if(num<0){
                sum += a.length-i;
                j--;
            }
            else{
                i++;
            }
        }
        return sum;
    }
}