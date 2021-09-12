package ExerciseDay1;

public class Task6 {
    public static void main(String[] args) {


        printMultiplicationTab();
        System.out.println("");
        printMultiplicationTab2(6, 0, 5);

        }

        private static void printMultiplicationTab() {
            for(int i = 1; i <= 4; i++) {
                System.out.println("5 x " + i + " = " + (5*i));
            }
        }
        private static void printMultiplicationTab2(int multiplier,int minMultiplicand, int maxMultiplicand) {

            for ( ; minMultiplicand <= maxMultiplicand ; minMultiplicand++){
                int resul = multiplier * minMultiplicand;
                System.out.println(multiplier + " x " + minMultiplicand + " = " + resul);
            }

        }
}
