class Solution {
    public String mergeAlternately(String word1, String word2) {
        // to store the final merged string
        String res = "";

// loop runs till both strings are fully traversed
        for (int i = 0; i < word1.length() || i < word2.length(); i++) {
            // if current index exists in first string
            if (i < word1.length())
                res+=word1.charAt(i);

            // if current index exists in second string 
            if (i < word2.length())
            res+= word2.charAt(i);
        }
        return res;
    }
}

// The idea is to merge two strings in an alternate fashion using a single loop. We iterate from index 0 to the maximum length of both strings. At each index, we first check if the current index exists in the first string and append its character to the result. Then we do the same for the second string. This ensures characters are added alternately. If one string is shorter, the remaining characters of the longer string are automatically appended because of the loop condition.


