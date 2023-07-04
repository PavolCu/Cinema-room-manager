class SimpleCalculator {

    // Implement your methods here
    public static void subtractTwoNumbers(long a, long b) {
        long result = a - b;
        System.out.println(result);
    }

    public static void sumTwoNumbers(long a, long b) {
        long result = a + b;
        System.out.println(result);
    }


    public static void divideTwoNumbers(long a, long b) {
        if (b == 0) {
            System.out.println("Division by 0!");
        } else {
            long result = a / b;
            System.out.println(result);
        }
    }


    public static void multiplyTwoNumbers(long a, long b) {
        long result = a * b;
        System.out.println(result);
    }

    // Implemented method
    public static void power(long n, long p) {
        long number = n;
        long power = p;
        long result = 1;
        while (power > 0) {
            if (power % 2 != 0) {
                result *= number;
            }
            power /= 2;
            number *= number;
        }
        System.out.println(result);
    }
}

public class Main {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        long num1 = scanner.nextLong();
        String operator = scanner.next();
        long num2 = scanner.nextLong();

        switch (operator) {
            case "^" -> SimpleCalculator.power(num1, num2);
            case "+" -> SimpleCalculator.sumTwoNumbers(num1, num2);
            case "-" -> SimpleCalculator.subtractTwoNumbers(num1, num2);
            case "/" -> SimpleCalculator.divideTwoNumbers(num1, num2);
            case "*" -> SimpleCalculator.multiplyTwoNumbers(num1, num2);
            default -> {
            }
        }
    }
}