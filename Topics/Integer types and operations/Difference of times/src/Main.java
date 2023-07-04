import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int hoursInSecAm = scanner.nextInt() * 60 * 60;
        final int minutesInSecAm = scanner.nextInt() * 60;
        final int secondsAm = scanner.nextInt();
        final int hoursInSecPm = scanner.nextInt() *  60 * 60;
        final int minutesInSecPm = scanner.nextInt() * 60;
        final int secondsPm = scanner.nextInt();
        int sumSecondsOfAm = hoursInSecAm + minutesInSecAm + secondsAm;
        int sumSecondsOfPm = hoursInSecPm + minutesInSecPm + secondsPm;
        int diffAmPm = sumSecondsOfPm - sumSecondsOfAm;
        System.out.println(diffAmPm);

    }
}
