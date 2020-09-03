import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLength = scanner.nextInt();
        int counter = numLength;

        for (int i = 1; i <= numLength; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(" " + i);
                counter--;
                if (counter == 0) {
                    break;
                }

            }
            if (counter == 0) {
                break;

            }

        }
    }
}