package ExerciseDay2;

public class Task3 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        String word = "ma";
        System.out.println(getIndex(input, word));

    }
    private static int getIndex(String input, String word) {
        if(word != null && !word.isBlank()){
        return input.contains(word) ? input.indexOf(word) : -1;
        }
        return  -1;
    }
}
