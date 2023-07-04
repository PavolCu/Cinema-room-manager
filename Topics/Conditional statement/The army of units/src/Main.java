import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int numOfSold = scanner.nextInt();
        if (numOfSold < 1) {
            System.out.println("no army");
        }  else if (numOfSold < 20) {
            System.out.println("pack");
        }  else if (numOfSold < 250) {
            System.out.println("throng");
        }  else if (numOfSold < 1000) {
            System.out.println("zounds");
        }  else {
            System.out.println("legion");
        }
    }
}
