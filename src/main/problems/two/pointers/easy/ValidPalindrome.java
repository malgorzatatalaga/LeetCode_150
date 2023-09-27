package problems.two.pointers.easy;
/*
125. Valid Palindrome
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String alphanumeric;
        for (Character c : s.toCharArray()) {
            if (Character.isDigit(c) || Character.isLetter(c)) {
               stringBuilder.append(c);
            }
        }
        alphanumeric = stringBuilder.toString().toLowerCase();
        int pointerA = 0;
        int pointerB = alphanumeric.length() - 1;
        while (pointerA <= pointerB) {
            if (alphanumeric.charAt(pointerA) != alphanumeric.charAt(pointerB)) return false;
            pointerA++;
            pointerB--;
        }
        return true;
    }
}
