package ExerciseDay3;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        timer();

    }

    private static void timer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert date [in format [yyyy-MM-dd HH:mm:ss]: ");

        String imput = scanner.nextLine();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime nextLesson = LocalDateTime.parse(imput, formatter);
        LocalDateTime now = LocalDateTime.now();

        long days = Duration.between(now, nextLesson).toDays();
        System.out.println("You have " + days + " day to the next lesson");

    }

}
