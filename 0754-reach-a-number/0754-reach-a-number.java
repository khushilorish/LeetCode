class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);

        int left = 0, right = target;
        int k = 0;

        // Binary search for minimum k where sum >= target
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sum = (long) mid * (mid + 1) / 2;

            if (sum >= target) {
                k = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        long sum = (long) k * (k + 1) / 2;

        // Fix parity
        while ((sum - target) % 2 != 0) {
            k++;
            sum += k;
        }

        return k;
    }
}