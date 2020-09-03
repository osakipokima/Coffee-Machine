import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long multiply = 1;

        for (long i = a, j = b; i < j; i++) {
            multiply *= i;
        }
        System.out.println(multiply);

    }
}