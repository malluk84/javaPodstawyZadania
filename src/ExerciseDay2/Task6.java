package ExerciseDay2;

public class Task6 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        char sign = 'z';
        System.out.println(getIndex(input, sign));

    }

    private static int getIndex(String input, char sign) {
        if (input != null && !input.isBlank()) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == sign) {
                    return i;

                }
            }
        }
        return -1;
    }
}
