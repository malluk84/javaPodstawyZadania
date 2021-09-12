package ExerciseDay2;

public class Task14 {
    public static void main(String[] args) {
        int arrays[] = {12, -7, 19, -5};
        int lengthNegativeDigit = getLengthNegativDigit(arrays);
        int[] negativeDigits = negativeArrays(lengthNegativeDigit, arrays);

        if(lengthNegativeDigit > 0) {
            for (int element : negativeDigits) {

                System.out.print(element + " ");
            }
        }

    }
    private static int getLengthNegativDigit(int arrays[]) {
        int counter = 0;
        for (int element : arrays) {
            if (element > 0) {
                counter++;
            }
        }
        return counter;
    }
    private static int[] negativeArrays(int length, int arrays[]) {
        int[] newArray = new int[length];
        for (int i = 0, j = 0; i < arrays.length; i++) {
            if(arrays[i] < 0) {
                newArray[j] = arrays[i];
                j++;
            }
        }
        return newArray;
    }
}
