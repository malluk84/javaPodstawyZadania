package ExerciseDay1;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(sumOfTheSequence(4, 11));
    }

    private static int sumOfTheSequence(int x, int y) {
        if(x > y) {
            return -1;
        }
        int result = 0;


        result = getResult(x, y, result);


        return result;
    }

    private static int getResult(int x, int y, int result) {
        for (int i = x; i <= y; i++) {
            result += i;
        }
        return result;
    }
}

