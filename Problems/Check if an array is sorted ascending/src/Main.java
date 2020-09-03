import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);
        int arraySize = numInput.nextInt(); //size of the array
        int[] array = new int[arraySize]; // creating new array for the elements
        boolean tryMe = true;

        for (int i = 0; i < arraySize; i++) { //looping through to retrieve inputs from user.
            array[i] = numInput.nextInt(); //storing line 2 inputs from user in array
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]) { //if "i" in the array is greater than the next value, its not ordered
                tryMe = false;

            }
        }
        System.out.println(tryMe);

    }
}