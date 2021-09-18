package ExerciseDay3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {
    public static void main(String[] args) {
        String correctString1 = "1234,1234";
        String correctString2 = "-1234,12";
        String correctString3 = "-1234";
        String inCorrectString1 = "123a123";
        String inCorrectString2 = "-123a123";
        String inCorrectString3 = ",123";

        System.out.println(correctString1 + " " + isCorrectString(correctString1));
        System.out.println(correctString2 + " " + isCorrectString(correctString2));
        System.out.println(correctString3 + " " + isCorrectString(correctString3));
        System.out.println(inCorrectString1 + " " + isCorrectString(inCorrectString1));
        System.out.println(inCorrectString2 + " " + isCorrectString(inCorrectString2));
        System.out.println(inCorrectString3 + " " + isCorrectString(inCorrectString3));
    }
    private static boolean isCorrectString(String string){
        // d digits posiada liczby
        String regex = "-?\\d+(,\\d+)?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
