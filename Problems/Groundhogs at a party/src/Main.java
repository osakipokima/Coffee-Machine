import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfReeses = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        boolean successfulonWeekday = numOfReeses >= 10 && numOfReeses <= 20;
        boolean successfulonWeekend = numOfReeses >= 15  && numOfReeses <= 25;

        boolean successfulParty = successfulonWeekday && !isWeekend;
        boolean unsuccessfulParty = successfulonWeekend && isWeekend;

        System.out.println(successfulParty || unsuccessfulParty);

    }
}