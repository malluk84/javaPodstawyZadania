package ExerciseDay2;

public class Task5 {
    public static void main(String[] args) {

        String input = "Ala ma kota";
        char sign = 'a';
        System.out.println(howManySignInWord(input,sign));

    }
    private static int howManySignInWord(String input, char sign) {
        if(input.isEmpty()) {
            return 0;
        }
        int counter = 0;
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == sign) {
                counter++;
            }
        }
        return counter;
    }

}
