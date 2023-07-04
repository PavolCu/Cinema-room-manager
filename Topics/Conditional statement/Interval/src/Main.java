import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        final int a = -15;
        final int b = 12;
        final int c = 14;
        final int d = 17;
        final int e = 19;
        if (num > a ^ num > b) {
            System.out.println("True");
        } else if (num > c ^ num > d && num != d) {
            System.out.println("True");
        } else if (num >= e) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}