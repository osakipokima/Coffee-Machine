import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aSide = scanner.nextInt();
        int bSide = scanner.nextInt();
        int cSide = scanner.nextInt();

        boolean condition1 = aSide + bSide > cSide;
        boolean condition2 = aSide + cSide > bSide;
        boolean condition3 = bSide + cSide > aSide;

        if (condition1 && condition2 && condition3) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}