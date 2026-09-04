class Solution {
    public int trap(int[] height) {
        // two pointers: start from both ends
        int left = 0;
        int right = height.length -1;

        // highest wall seen so far from each side
        int leftMax = 0;
        int rightMax = 0;

        // total amount of trapped water
        int water = 0;

        while(left < right) {

            // if left wall is smaller, process the left side
        if(height[left] < height[right]){
            leftMax = Math.max(leftMax, height[left]);

            // water trapped = leftMax - current height
            water += leftMax - height[left];

            // Move left pointer forward
            left++;
        } else {
            rightMax = Math.max(rightMax, height[right]);
            water += rightMax - height[right];
            right--;
        }
    }
    return water;
}
}