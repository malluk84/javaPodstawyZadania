package ExerciseDay2;

public class Task15 {
    public static void main(String[] args) {
        String[] firstArray = {"Ala", "ma", "kota"};
        String[] secondArray = {"Ala", "ma", "kotaa"};
        checkArray(firstArray, secondArray);
    }
    private static void checkArray(String[] firstArray, String[] secondArryay) {
        if (firstArray.length != secondArryay.length) {
            System.out.println("Arrays are diffrent");
        } else {
            boolean ifArraydiffrent = false;
            for (int i = 0; i < firstArray.length; i++) {
                if (!firstArray[i].equals(secondArryay[i])) {
                    ifArraydiffrent = true;
                    break;
                }
            }
            System.out.println(!ifArraydiffrent);
        }
    }
}

