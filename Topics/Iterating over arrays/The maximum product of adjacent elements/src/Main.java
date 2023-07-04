import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int numElements = scanner.nextInt();
        int[] array = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            array[i] = scanner.nextInt();
        }
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < numElements - 1; i++) {
            int product = array[i] * array[i + 1];
            if (product > maxProduct) {
                maxProduct = product;
            }
        }

        // Print the maximum product
        System.out.println(maxProduct);
    }
}