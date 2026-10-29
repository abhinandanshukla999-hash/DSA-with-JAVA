public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "status";
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else {
                if (isPalindrome(str, left + 1, right) ||
                        isPalindrome(str, left, right - 1)) {
                    System.out.println("Valid Palindrome");
                } else {
                    System.out.println("Not a Valid Palindrome");
                }
                return;
            }
        }

        System.out.println("Valid Palindrome");
    }

    static boolean isPalindrome(String str, int left, int right) {
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}
