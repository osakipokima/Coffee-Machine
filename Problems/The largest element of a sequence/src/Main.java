import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numInput = input.nextInt();
        while (input.hasNextLine()) {
            int maxNum = input.nextInt();
            if (maxNum > numInput) {
                numInput = maxNum;

            }
        }
        System.out.println(numInput);


    }
}