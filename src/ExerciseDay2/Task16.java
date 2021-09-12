package ExerciseDay2;

public class Task16 {
    public static void main(String[] args) {
        int array[] = {12, 7, 19};

    }
    private static int[] reverseArray(int[] inputs) {
        int tmp = inputs[0];
        inputs[0] = inputs[2];
        inputs[2] = tmp;
        return inputs;
    }
}
