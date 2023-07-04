import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int durInDays = scanner.nextInt();
        int totFCtPDay = scanner.nextInt();
        int oneWayFlightCost = scanner.nextInt();
        int costOfHotel = scanner.nextInt();
        System.out.println(totFCtPDay * durInDays + oneWayFlightCost * 2 + costOfHotel * (durInDays - 1));
    }
}