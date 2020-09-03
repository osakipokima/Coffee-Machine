import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int numC = scanner.nextInt();

        System.out.println((numA + numB == 20) || (numB + numC == 20) || (numA + numC == 20));


    }
}