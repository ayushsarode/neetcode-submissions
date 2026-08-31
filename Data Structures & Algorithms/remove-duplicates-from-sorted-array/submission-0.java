class Solution {
    public int removeDuplicates(int[] nums) {
        int uniqueIndex = 0;

        for(int currentElement : nums) {
            // check if this is first element or if it's different from the prev unique element
// For [1,1,2], when we encounter the second 1,
            // nums[uniqueIndex - 1] is already 1, so it gets skipped.
            if(uniqueIndex == 0 || currentElement != nums[uniqueIndex - 1]) {
                // place the unique element at the current unique position
                nums[uniqueIndex] = currentElement;
                uniqueIndex++;
            }
        }
        return uniqueIndex;
    }
}