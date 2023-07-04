import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        // Read the size of the input array
        int size = scanner.nextInt();
        int[] arr = new int[size];
        // Read the elements of the array
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Read the integer number
        int n = scanner.nextInt();

        // Count the occurrences of n in the array
        int occurrences = countOccurrences(arr, n);

        // Print the result
        System.out.println(occurrences);

        scanner.close();
    }

    public static int countOccurrences(int[] arr, int n) {
        int count = 0;
        for (int num : arr) {
            if (num == n) {
                count++;
            }
        }
        return count;
    }
}