class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        int left = 1;
        int right = x;
        int firstTrueIndex = -1;

        while(left <= right) {
            int mid = left + (right - left) /2;

            if(mid > x / mid) {
                firstTrueIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if(firstTrueIndex == -1) {
            return x;
        }
        return firstTrueIndex - 1;
    }
}

// lets take 15
// lower than 15 is 3*3 = 9 
// higher than 15 is 4*4 = 16
// so input x = 15 and output is 4


// here 15 mid, which cant be possible so nearest is 16, 4 output
// 