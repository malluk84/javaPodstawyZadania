package ExerciseDay2;

public class Task15 {
    public static void main(String[] args) {
        String[] firstArray = {"Ala", "ma", "kota"};
        String[] secondArray = {"Ala", "ma", "kota"};
        checkArray(firstArray, secondArray);
        System.out.println(checkArray(firstArray, secondArray));

    }
    private static boolean checkArray(String[] firstArray, String[] secondArryay) {
        if (firstArray.length == secondArryay.length) {
            for (int i = 0; i < firstArray.length; i++) {
                if (!firstArray[i].equals(secondArryay[i])) {
                    return false;
                }
            }
            return true;
            /*System.out.println("Arrays are diffrent");
            return false;*/
        }
        /*else {
            boolean ifArraydiffrent = false;
            System.out.println(!ifArraydiffrent);
        }*/
        return false;
    }
}

