import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final  Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int result = ((n + 1) * n + 2) * n + 3;
        System.out.println(result);
    }
}
