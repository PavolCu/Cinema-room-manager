import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int number = scanner.nextInt();

        int thousands = number / 1000;     // Extract thousands digit
        int hundreds = (number / 100) % 10; // Extract hundreds digit
        int tens = (number / 10) % 10;      // Extract tens digit
        int units = number % 10;            // Extract units digit

        if (thousands == units && hundreds == tens) {
            System.out.println("1"); // Number is symmetric
        } else {
            System.out.println("37"); // Number is not symmetric
        }
    }
}