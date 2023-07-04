import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int busHeight = scanner.nextInt();
        int numBridges = scanner.nextInt();

        int[] bridgeHeights = new int[numBridges];
        for (int i = 0; i < numBridges; i++) {
            bridgeHeights[i] = scanner.nextInt();
        }

        boolean willCrash = false;
        int crashingBridge = -1;

        for (int i = 0; i < numBridges; i++) {
            if (bridgeHeights[i] <= busHeight) {
                willCrash = true;
                crashingBridge = i + 1; // Adding 1 to match the bridge number
                break;
            }
        }

        if (willCrash) {
            System.out.println("Will crash on bridge " + crashingBridge);
        } else {
            System.out.println("Will not crash");
        }
    }
}