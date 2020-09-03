import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numValue;
        int sum = 0;
        do {
            numValue = scanner.nextInt();
            sum += numValue;

        }
        while (numValue != 0);
        System.out.println(sum);

    }
}