class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            // Step 1: Skip non-alphanumeric from left
            while (start < end && !alphaNum(s.charAt(start))) {
                start++;
            }
            // Step 2: Skip non-alphanumeric from right
            while (end > start && !alphaNum(s.charAt(end))) {
                end--;
            }
            // Step 3: Compare characters in lowercase
            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false; // Fixed colon to semicolon
            }

            start++;
            end--;
        }
        return true;
    }

    public boolean alphaNum(char c) {
        // Fixed double quotes "" to single quotes ''
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}