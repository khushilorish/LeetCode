class Solution {
    public int minimumCardPickup(int[] cards) {
        int minLength = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        int start = 0;

        for(int end = 0; end<cards.length; end++){
            map.put(cards[end], map.getOrDefault(cards[end], 0)+1);
            while(map.get(cards[end]) == 2){
                minLength = Math.min(minLength, end-start+1);
                map.put(cards[start], map.get(cards[start])-1);
                start++;
            }
        }
        return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }
}