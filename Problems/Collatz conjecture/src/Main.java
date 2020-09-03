import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int naturalNum = scanner.nextInt();
        System.out.print(naturalNum + " ");

        do {
            if (naturalNum % 2 == 0) {
                naturalNum /= 2;
                System.out.print(naturalNum + " ");
            }
            if (naturalNum % 2 == 1 && naturalNum != 1) {
                naturalNum = ((3 * naturalNum) + 1);
                System.out.print(naturalNum + " ");
            }

        } while (naturalNum > 1);


    }
}