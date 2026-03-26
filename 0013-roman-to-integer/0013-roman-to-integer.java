class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)=='M'){
                ans += 1000;
                if(i>0){
                    if(s.charAt(i-1)=='D'){
                        ans -= 500;
                        i--;
                    }
                    else if(s.charAt(i-1)=='C'){
                        ans -= 100;
                        i--;
                    }
                }
            }else if(s.charAt(i)=='D'){
                ans += 500;
                if(i>0){
                    if(s.charAt(i-1)=='C'){
                        ans -= 100;
                        i--;
                    }
                }
            }else if(s.charAt(i) == 'C'){
                ans += 100;
                if(i>0){
                    if(s.charAt(i-1) == 'L'){
                        ans -= 50;
                        i--;
                    }
                    else if(s.charAt(i-1) == 'X'){
                        ans -= 10;
                        i--;
                    }
                }
            }else if(s.charAt(i)=='L'){
                    ans += 50;
                    if(i>0){
                        if(s.charAt(i-1)=='X'){
                            ans -= 10;
                            i--;
                        }
                    }
            }else if(s.charAt(i)=='X'){
                ans += 10;
                if(i>0){
                    if(s.charAt(i-1)=='I'){
                        ans -= 1;
                        i--;
                    }
                }
            }else if(s.charAt(i)=='V'){
                ans += 5;
                if(i>0){
                    if(s.charAt(i-1)=='I'){
                        ans -= 1;
                        i--;
                    }
                }
            } else{
                ans += 1;
            }
        }
        return ans;
    }
}