package ExerciseDay3.Task2;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Sienkiewicz", "PL");
        Author author2 = new Author("Tuwim", "PL");
        Author author3 = new Author("J.K. Rawling", "GB");

        Poem[] poems = new Poem[3];
        poems[0] = new Poem(author1, 15);
        poems[1] = new Poem(author2, 55);
        poems[2] = new Poem(author3, 35);

        System.out.println();
        System.out.println(getSurnameWithMaxStropheNumbers(poems));
        System.out.println();
        System.out.println(getSurnameWithMaxStropheNumbersV2(poems));

    }
    private static String getSurnameWithMaxStropheNumbers(Poem[] poems) {
        int maxStropheNumbers = 0;
        String author = null;
        for (Poem poem : poems) {
            int currentStropheNumber = poem.getStropheNumbers();
                if (maxStropheNumbers < currentStropheNumber) {
                    maxStropheNumbers = currentStropheNumber;

                    author = poem.getCreator().getSurmane();
                }

        }
        return author;

    }
    private static Author getSurnameWithMaxStropheNumbersV2(Poem[] poems) {
        int maxStropheNumbers = 0;
        Author author = null;
        for (Poem poem : poems) {
            int currentStropheNumber = poem.getStropheNumbers();
            if (maxStropheNumbers < currentStropheNumber) {
                maxStropheNumbers = currentStropheNumber;

                author = poem.getCreator();
            }

        }
        return author;
    }

}
