class Solution {
    public int lengthOfLastWord(String s) {
        int a =0;
        s = s.trim();
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) != ' '){
                a +=1;
            }else{
                break;
            }
        }
        return a;
    }
}