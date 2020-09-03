import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fourDigitNum = scanner.nextLine();

        int firstDigit = fourDigitNum.charAt(0);
        int secondDigit = fourDigitNum.charAt(1);
        int thirdDigit = fourDigitNum.charAt(2);
        int fourthDigit = fourDigitNum.charAt(3);



        if (secondDigit == thirdDigit && firstDigit == fourthDigit) {
            System.out.println(1);
        } else if (fourDigitNum.length() < 4) {
            System.out.println(1);

        } else if (firstDigit == fourthDigit && secondDigit == thirdDigit) {
            System.out.println(1);
        } else {
            System.out.println(69);
        }
    }
}