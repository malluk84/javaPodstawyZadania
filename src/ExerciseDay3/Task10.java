package ExerciseDay3;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        timer();

    }

    private static void timer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter button to start stoper: ");
        scanner.nextLine();
        LocalTime startTime = LocalTime.now();
        System.out.println("Press Enter button to stop stoper: ");
        scanner.nextLine();
        LocalTime stopTime = LocalTime.now();


        Duration duration = Duration.between(startTime, stopTime);
        System.out.println("Total time " + duration.toSeconds() + " sec");

    }
}
