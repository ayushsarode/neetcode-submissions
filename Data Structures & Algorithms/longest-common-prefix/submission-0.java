// 

class Solution {
    public String longestCommonPrefix(String[] strs) {
        // sort the array of strings
        Arrays.sort(strs);

        // get the first and last strings from array
        String first = strs[0];
        String last  = strs[strs.length - 1];


        // gives min length of strings e.g geezer and geez
        // minLength = 4
        int minLength = Math.min(first.length(), last.length());

        int i = 0;

        while(i < minLength && first.charAt(i) == last.charAt(i)) {
        i++;
    }
       // return the common prefix
    return first.substring(0, i);
    }

 
}