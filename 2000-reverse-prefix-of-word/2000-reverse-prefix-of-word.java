class Solution {
    public String reversePrefix(String word, char ch) {
        String ans = "";
        int i = 0;
        
        while((i<word.length()) && (ch != word.charAt(i))){
            ans = word.charAt(i) + ans;
            i++;
        }
        
        if(i>=word.length()){
            return word;
        }
        
        return ch + ans + word.substring(i+1);
    }
}