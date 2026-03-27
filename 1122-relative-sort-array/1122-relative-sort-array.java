class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int curr =0, idx=0;
        int[] ans = new int[arr1.length];
        ArrayList<Integer> a = new ArrayList<>(arr2.length);
        Arrays.sort(arr1);
        for(int i=0; i<arr2.length; i++){
            curr = arr2[i];
            for(int j=0; j<arr1.length; j++){
                if(arr1[j] == curr){
                    a.add(arr2[i]);
                    ans[idx] = arr1[j];
                    idx += 1;
                    if(j != arr1.length-1){
                        if(arr1[j+1] != curr){
                            break;
                        }
                    }
                }
            }
        }

        int size = arr1.length-idx;
        ArrayList<Integer> b = new ArrayList<>(size);
        if(size>0){
            int j=0;
            for(int i=0; i<arr1.length; i++){
                if(!a.contains(arr1[i])){
                    b.add(arr1[i]);
                    j++;
                }
            }
        }
        Collections.sort(b);
        for(int i=0; i<size; i++){
            ans[idx]=b.get(i);
            idx += 1;
        }
        return ans;
    }
}