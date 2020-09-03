import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);
        int sum = 0;

        while (numInput.hasNextLine()) {
            int num = numInput.nextInt();
            sum += num;
            if (sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            } else if (num == 0) {
                System.out.println(sum);
                break;
            }

        }

    }
}