import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number: " );
        float a = scanner.nextFloat();
        System.out.println("Enter operator: ");
        char operator = scanner.next().charAt(0);
        System.out.println("Enter 2nd umber: ");
        float b = scanner.nextFloat();
        float result = calculate(a, b, operator);
        System.out.println("Resoult: " + a + " " + operator + " " + b + " = " + result);

    }

    private static float calculate(float a, float b, char operator) {
        float result = 0;
        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if(b == 0) {
                    System.out.println("Wrong operation");
                    System.exit(1);
                }
                result = a / b;
                break;
            default:
                System.out.println("Operator not exist");
                System.exit(1);
        }
        return result;
    }
}
