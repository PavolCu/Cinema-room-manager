import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfAnArray = scanner.nextInt();
        int[] array = new int[sizeOfAnArray];

        // Read the elements of the array
        for (int i = 0; i < sizeOfAnArray; i++) {
            array[i] = scanner.nextInt();
        }

        // Read the number n
        int n = scanner.nextInt();

        // Calculate the sum of elements greater than n
        int sum = 0;
        for (int i = 0; i < sizeOfAnArray; i++) {
            if (array[i] > n) {
                sum += array[i];
            }
        }

        // Print the result
        System.out.println(sum);
    }
}