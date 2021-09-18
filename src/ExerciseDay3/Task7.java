package ExerciseDay3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) {


    String correctIban = "PL10155000997603123456789123";
    String inCorrectIban = "1234";

        System.out.println(correctIban + " " + isCorrectIbanFormat(correctIban));
        System.out.println(inCorrectIban + " " + isCorrectIbanFormat(inCorrectIban));

}
    private static boolean isCorrectIbanFormat(String iban) {
        // + jede lub wiele znaków
        //* zero lub wiele znaków
        //? zero lub jeden znak
        String regex = "PL[0-9]{26}";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(iban).matches();
       /* Matcher matcher = pattern.matcher(iban);
        return matcher.matches();*/
    }
}
