import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        // Read input size
        int size = scanner.nextInt();

        // Read array elements
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Check if the array is sorted
        boolean result = isSortedAscending(array);

        // Output the result
        System.out.println(result);

        scanner.close();
    }

    public static boolean isSortedAscending(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}