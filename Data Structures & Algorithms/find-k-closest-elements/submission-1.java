class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // Binary search the whole range
        int low = 0;
        int high = arr.length - k;

        while (low < high) {
            int mid = low + (high - low) / 2; // mid be the starting point of range
            // arr[mid] -> arr[mid+k]
            // Check what's closer to x, mid (starting of range) or ending mid+k
            if (x - arr[mid] > arr[mid + k] - x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        //[2,4,5,8] x=6 , k=2
        // low = 0, high = 3, mid = 1
        //     low = 0, high = 1, mid = 0
        //         low = 1, high = 1, mid = 0
        // We start with m but as our range converges l==r, mid is outdated and l
        // low becomes the starting point we need
        List<Integer> res = new ArrayList<>();
        for (int i = low; i < low + k; i++) {
            res.add(arr[i]);
        }
        return res;
    }
}