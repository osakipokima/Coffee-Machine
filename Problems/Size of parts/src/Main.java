import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int largePart = 0;
        int smallPart = 0;
        int perfectPart = 0;
        int partsSize;

        for (int i = 0; i < n; i++) {
            partsSize = scanner.nextInt();
            if(partsSize == 1) {
                largePart++;
            } else if (partsSize == -1) {
                smallPart++;
            } else {
                perfectPart++;
            }


        }

        System.out.println(perfectPart + " " + largePart + " " + smallPart);


    }
}