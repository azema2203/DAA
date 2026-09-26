class Solution {
    public int search(int[] nums, int a) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == a) {
                return mid;
            }

            if (nums[mid] < a) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}