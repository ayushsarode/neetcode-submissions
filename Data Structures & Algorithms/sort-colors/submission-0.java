class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int lo = 0;
        int hi = n - 1;
        int mid = 0;

        // process elements until mid crosses hi 

        while (mid <= hi) {
            if (nums[mid] == 0) {
                int temp = nums[lo];
                nums[lo++] = nums[mid];
                nums[mid++] = temp; 
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[hi];
                nums[hi--] = temp;
            }
        }
    }
}