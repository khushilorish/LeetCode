class Solution {
    public boolean isValid(String s) {
        if(s.charAt(0) == ']' | s.charAt(0)=='}' | s.charAt(0)==')' | s.length()==1){
            return false;
        }

        int square = 0;
        int curly =0;
        int curve = 0;
        int i=0;
        StringBuilder s2 = new StringBuilder();

        while(i < s.length()){
            if(s.charAt(i)=='('){
                s2.append(')');
            }else if(s.charAt(i) == '{'){
                s2.append('}');
            }else if(s.charAt(i) == '['){
                s2.append(']');
            }
                        
            else{
                if(s2.isEmpty()){
                    return false;
                }
                int j = s2.length()-1;
                if(s.charAt(i) != s2.charAt(j)){
                    return false;
                }
                else{
                    s2.deleteCharAt(j);
                }
            }
            i++;
        }
        return s2.length()==0;
    }
}