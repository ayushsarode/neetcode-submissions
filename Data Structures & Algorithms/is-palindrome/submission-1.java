class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;


        while(left < right) {
            char ci = s.charAt(left);
            char cj = s.charAt(right);

            if(!Character.isLetterOrDigit(ci)) {
                left++;
            } else if(!Character.isLetterOrDigit(cj)) {
                right--;
            } else if(Character.toLowerCase(ci) == Character.toLowerCase(cj)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
