package ExerciseDay2;

import java.util.Arrays;

public class Task16 {
    public static void main(String[] args) {
        int[] inputs = {12, 7, 19};
        Arrays.stream(reverseArray(inputs)).forEach(System.out::println);
    }
    private static int[] reverseArray(int[] inputs) {
        for (int i = 0; i < inputs.length/2; i++) {
            int temp = inputs[i];
            int nextPosition = (inputs.length - 1) - 1;
            inputs[i] = inputs[nextPosition];
            inputs[nextPosition] = temp;
        }
        return inputs;
    }
}
