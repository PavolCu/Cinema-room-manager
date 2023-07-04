import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (c % a == 0 && c / a < b || c % b == 0 && c / b < a) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}