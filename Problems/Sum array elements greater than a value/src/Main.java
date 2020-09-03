import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeOfArray = scanner.nextInt(); //array size
        int[] array = new int[sizeOfArray]; //creating new array on G
        int i, j; //used for our for loops

        for (i = 0; i < sizeOfArray; i++) { //iterating through based on the size of the array
            array[i] = scanner.nextInt(); //taking input from the user and adding it to the array
        }
        int n = scanner.nextInt(); //used for summing elements
        int sum = 0;

        for (j = 0; j < sizeOfArray; j++) { //iterating through AGAIN :/
            if (array[j] > n) {
                sum += array[j];
            }
        }
        System.out.println(sum);


    }
}