public class Task8 {
    public static void main(String[] args) {
        int x = 2;
        int y = 10;
        for (int i = x; i <= y; i++) {
            for (int j = x; j <= i; j++) {
                if (j == i) {
                    System.out.println(i);
                }
                if (i % j == 0) {
                    break;
                }
            }
        }
    }
}
