package ExerciseDay2;

public class Task13 {
    public static void main(String[] args) {
        int[] tab = {12, 7, 19};
        int minValue = getMinValue(tab);
        System.out.println("Min value is: " + minValue);
        int maxValue = getMaxValue(tab);
        System.out.println("Max value is: " + maxValue);
        int sum = getSum(tab);
        System.out.println("Sum of elements of array: " + sum);

    }
    private static int getMinValue(int[] tab) {
        int minValue = Integer.MAX_VALUE;
        for (int j : tab) {
            if (minValue > j) {
                minValue = j;
            }
        }
        return minValue;
    }
    private static int getMaxValue(int[] tab) {
        int maxValue = Integer.MIN_VALUE;
        for (int j : tab) {
            if (maxValue < j) {
                maxValue = j;
            }
        }
        return maxValue;
    }
    private static int getSum(int[] tab) {
        int sum = 0;
        for (int j : tab) {
            sum += j;
        }
        return sum;
    }
}
