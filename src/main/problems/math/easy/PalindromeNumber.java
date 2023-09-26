package problems.math.easy;
/*
9. Palindrome Number
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x == 0) return true;
        if (x < 0 || x % 10 == 0) return false;
        int reversedX = 0;
        while (x > reversedX) {
            int lastDigit = x % 10;
            x /= 10;
            reversedX = (reversedX * 10) + lastDigit;
        }
        return x == reversedX || x == reversedX / 10;
    }
}
