package ExerciseDay2;

public class Task11 {
    public static void main(String[] args) {
        System.out.println(ifPalindrome("kajak"));
        System.out.println(ifPalindrome("sda"));

    }
    private static boolean ifPalindrome(String input) {
        StringBuilder sbAfterReverse = new StringBuilder(input).reverse();
        String stringAfterReverse = sbAfterReverse.toString();
        return stringAfterReverse.equals(input);
    }

}
