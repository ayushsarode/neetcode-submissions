// brute force method


class Solution {
    public int majorityElement(int[] nums) {
        //outer loop

        for (int i =0;i < nums.length; i++) {
            int count=  0;

            for (int j= 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > nums.length/2) {
                return nums[i];
            }
        }
        return -1;
    }
}

// i = which no. i am checking
// j = search the whole aray for that no.
// count =  how many times i fount it 