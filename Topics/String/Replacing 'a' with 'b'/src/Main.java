import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String input = scanner.nextLine();

        String result = replaceCharacters(input);
        System.out.println(result);
    }

    private static String replaceCharacters(String input) {
        return input.replace('a', 'b');
    }
}