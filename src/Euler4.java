public class Euler4 {
    /**
     * A palindromic number reads the same both ways. The largest palindrome made from the product of
     * two 2-digit numbers is 9009 = 91 × 99.
     * <p>
     * Find the largest palindrome made from the product of two 3-digit numbers.
     */
    public static void main(String[] args) {
        int largestPalindrome = 0;
        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                int result = i * j;

                String strResult = String.valueOf(result);
                StringBuilder sb = new StringBuilder();
                for (int c = strResult.length() - 1; c >= 0; c--) {
                    sb.append(strResult.charAt(c));
                }

                int reverse = Integer.parseInt(sb.toString());

                if (result == reverse && result > largestPalindrome) {
                    largestPalindrome = result;
                }
            }
        }

        System.out.println(largestPalindrome);
    }
}
