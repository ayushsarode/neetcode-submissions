class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        
        int right = s.length - 1;


        // swap char from both ends till we reach the middle of the string

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

}


