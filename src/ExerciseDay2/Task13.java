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
    private static int getMinValue(int tab[]) {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < tab.length; i++) {
            if (minValue > tab[i]) {
                minValue = tab[i];
            }
        }
        return minValue;
    }
    private static int getMaxValue(int tab[]) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < tab.length; i++) {
            if (maxValue < tab[i]) {
                maxValue = tab[i];
            }
        }
        return maxValue;
    }
    private static int getSum(int tab[]) {
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }
        return sum;
    }
}
