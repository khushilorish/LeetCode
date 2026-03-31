class Solution {
    public int maxValue(int n, int index, int maxSum) {
        int low = 1, high = maxSum;

        while (low < high) {
            int mid = (low + high + 1) / 2;

            if (valid(mid, n, index, maxSum)) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    private boolean valid(int mid, int n, int index, int maxSum) {
        long sum = mid;

        sum += calc(mid - 1, index);           // left
        sum += calc(mid - 1, n - index - 1);   // right

        return sum <= maxSum;
    }

    private long calc(int peak, int len) {
        if (peak >= len) {
            return (long)(peak + (peak - len + 1)) * len / 2;
        } else {
            return (long)(peak + 1) * peak / 2 + (len - peak);
        }
    }
}