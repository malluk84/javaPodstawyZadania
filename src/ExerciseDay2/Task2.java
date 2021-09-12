package ExerciseDay2;

public class Task2 {
    public static void main(String[] args) {
        String input = "programowanie";
        String prefix = "pro";
        String suffix = "nie";
        System.out.println(isWordContainsPrefix(input, prefix));
        System.out.println(isWordContainsSuffix(input, suffix));
    }
    private static boolean isWordContainsPrefix(String input, String prefix){
        return input.startsWith(prefix);
    }
    private static boolean isWordContainsSuffix(String input, String suffix){
        return input.endsWith(suffix);
    }
}
