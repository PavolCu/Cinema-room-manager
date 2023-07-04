import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int[] box1 = readBoxDimensions(scanner);
        int[] box2 = readBoxDimensions(scanner);

        if (isBoxSmaller(box1, box2)) {
            System.out.println("Box 1 < Box 2");
        } else if (isBoxSmaller(box2, box1)) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }

    private static int[] readBoxDimensions(Scanner scanner) {
        int[] dimensions = new int[3];
        for (int i = 0; i < 3; i++) {
            dimensions[i] = scanner.nextInt();
        }
        Arrays.sort(dimensions);
        return dimensions;
    }

    private static boolean isBoxSmaller(int[] box1, int[] box2) {
        return box1[0] < box2[0] && box1[1] < box2[1] && box1[2] < box2[2];
    }
}
