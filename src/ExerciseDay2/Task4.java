package ExerciseDay2;

public class Task4 {
    public static void main(String[] args) {
        String text = "Ala ma, kota. a kot, ma Ale";
        System.out.println(text);
        System.out.println(replaceChar(text));


    }
    private static String replaceChar(String text) {
        String result = text.replace(",","-STOP-").replace(".", "-STOP-");
        
        return result;
    }
}
