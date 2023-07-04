import java.util.Scanner;
import java.util.Arrays;

class Main {
    // implement me
    private static void rotate(int[] arr, int steps) {
        int length = arr.length;
        int adjustedSteps = steps % length;
        int[] temp = new int[length];
        System.arraycopy(arr, 0, temp, adjustedSteps, length - adjustedSteps);
        System.arraycopy(arr, length - adjustedSteps, temp, 0, adjustedSteps);
        System.arraycopy(temp, 0, arr, 0, length);
    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}