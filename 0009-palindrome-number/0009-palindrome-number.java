class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        // Single digit numbers are always palindromes
        if (x < 10) {
            return true;
        }

        int original = x;
        int reversed = 0;

        while (x > 0) {
            int digit = x % 10; // Extract the last digit
            x /= 10; // Remove the last digit from x
            
            // Check for overflow before updating reversed
            if (reversed > (Integer.MAX_VALUE - digit) / 10) {
                return false; // Return false in case of overflow
            }
            
            reversed = reversed * 10 + digit; // Append the digit to reversed
        }

        return original == reversed; // Check if the original number equals the reversed number
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int x1 = 121; // Example input
        System.out.println(x1 + " is palindrome: " + sol.isPalindrome(x1));
        
        int x2 = -121; // Example input
        System.out.println(x2 + " is palindrome: " + sol.isPalindrome(x2));
        
        int x3 = 10; // Example input
        System.out.println(x3 + " is palindrome: " + sol.isPalindrome(x3));
    }
}
