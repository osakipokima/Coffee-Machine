import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt(); //line 1 size of the array
        int[] array = new int[arraySize]; //creating new array for the elements
        int i;
        boolean tryMe = true;
        for (i = 0; i < arraySize; i++) { //looping through to retrieve inputs from user.
            array[i] = scanner.nextInt(); //storing line 2 inputs from user in array
        }
        int n = scanner.nextInt(); //n and m used to to see if they never occur next to each other
        int m = scanner.nextInt();
        for (i = 1; i < arraySize; i++) {
            if (array[i] == n && array[i - 1] == m || (array[i] == m && array[i - 1] == n)) {
                tryMe = false;
                break;
            }

        }
        System.out.println(tryMe);

    }

}
