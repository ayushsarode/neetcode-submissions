class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;

        int MaxAreaFound = 0;

        // continue until the two pointers meet
        while(left < right) {
            int currentHeight = Math.min(heights[left], heights[right]);


            // in diagram lets say 7(overall) - 1(one from left) = 6
            int currentWidth = right - left;

            // a = w * h
            int currentArea = currentHeight * currentWidth;


            // update max area if current area is lower
            MaxAreaFound = Math.max(MaxAreaFound, currentArea);

            if (heights[left] < heights[right]) {
                left ++;
            } else {
                right--;
            }
        }
        return MaxAreaFound;
    }
}
