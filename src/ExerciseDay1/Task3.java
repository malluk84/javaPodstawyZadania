package ExerciseDay1;

import java.util.Scanner;

public class Task3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert first digit: ");
        int x = scanner.nextInt();

        System.out.print("Please insert second digit: ");
        int y = scanner.nextInt();

        boolean result;

        result = x > y;
        System.out.println("If 1st number is greater than 2nd number: " + result);

        result = x * 3 > y;
        System.out.println("If 1st * 3 is greater than 2nd: " + result);

        result = (y++ < ++x) && (--x < y++);
        System.out.println("If 2nd++ is smaller than ++1st and --1st is smaller than 2nd++: " + result);

        result = (x * y) % 2 == 0;
        System.out.println("If 1st number * 2nd number is even: " + result);
    }
}
