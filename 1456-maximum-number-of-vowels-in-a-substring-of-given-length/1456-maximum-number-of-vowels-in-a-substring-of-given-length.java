class Solution {
    public int maxVowels(String s, int k) {
        int start=0, vowels=0;
        int maxVowels = 0;
        for(int end =0; end<s.length(); end++){
            if(isValid(s.charAt(end))){
                vowels += 1;
            }
            if(end>= k-1){
                maxVowels = Math.max(maxVowels, vowels);
                if(isValid(s.charAt(start))){
                    vowels -= 1;
                }
                start += 1;
            }
        }
        return maxVowels;
    }

    private boolean isValid(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        return false;
    }
}