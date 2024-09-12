class Solution {
    public boolean isPalindrome(String s) {
        return isPal(s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(), 0);
    }
    
    private boolean isPal(String s, int i) {
        return i >= s.length() / 2 || (s.charAt(i) == s.charAt(s.length() - 1 - i) && isPal(s, i + 1));
    }
}
