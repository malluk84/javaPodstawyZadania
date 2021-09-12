package ExerciseDay2;

public class Task1 {
    public static void main(String[] args) {
        String word = "ala ";
        String word2 = "domek ";
        System.out.println("Orginal word: " + word);
        System.out.println("Last char is: " + getLastCharWord(word));
        System.out.println("Orginal word2: " + word2);
        System.out.println("Last char is: " + getLastCharWord2(word2));

    }
    private static char getLastCharWord(String word){
        if(word == null || word.isBlank()){             //" .isBlank() "usuwa wszystkie białe znaki
            System.exit(-1);
        }
        word = word.trim();                             //" .trim() " usuwa spacje z tyłu i przodu
        int lastPosition = word.length() - 1;
        return word.charAt(lastPosition);
    }
    private static String getLastCharWord2(String word2) {
        if(word2 == null || word2.isBlank()){             //" .isBlank() "usuwa wszystkie białe znaki
            System.exit(-1);
        }
        word2 = word2.trim();                             //" .trim() " usuwa spacje z tyłu i przodu
        int lastPosition = word2.length() - 1;
        return word2.substring(lastPosition);
    }

}
