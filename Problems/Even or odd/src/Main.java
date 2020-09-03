import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);

        while (numInput.hasNextLine()) {
            int naturalNum = numInput.nextInt();
            if (naturalNum % 2 == 0 && naturalNum != 0) {
                System.out.println("even");
            } else if (naturalNum % 2 == 1) {
                System.out.println("odd");
            } else {
                break;
            }

        }


    }
}