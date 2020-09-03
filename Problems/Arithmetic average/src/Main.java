import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double sum = 0;
        int count = 0;


        for (double i = a, j = b; i <= j; i++) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
        }
        System.out.println(sum / count);


    }
}