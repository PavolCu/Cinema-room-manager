import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1  = scanner.nextLine().replace(" ", "");
        String s2 = scanner.nextLine().replace(" ", "");
        System.out.println(s1.equals(s2));


    }
}