import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numOfElements = scanner.nextInt();

        int maximum = 0;
        int i = 0;

        while (i < numOfElements) {

            int element = scanner.nextInt();

            if (element % 4 == 0 && element > maximum) {
                maximum = element;
            }

            i++;
        }

        System.out.println(maximum);
    }
}
