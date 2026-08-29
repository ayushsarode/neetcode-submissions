class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while(l < r) {
            char ci = s.charAt(l);
            char cj = s.charAt(r);

            if (!Character.isLetterOrDigit(ci)) {
                l++;
            } else if (!Character.isLetterOrDigit(cj)) {
                r--;
            } else if (Character.toLowerCase(ci) == Character.toLowerCase(cj)) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }
}