package ExerciseDay1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        System.out.println(sumOfDigits(number));

    }
    private static int sumOfDigits(int number){
        if(number < 9){
            return number;
        }
        int sum = 0;
        do {
            sum += number % 10;
        } while (number != 0);

        return sum;

    }
}
