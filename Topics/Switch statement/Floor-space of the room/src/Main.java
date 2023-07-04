import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        String shape = scanner.next();

        switch (shape) {
            case "rectangle" -> {
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                double area = length * width;
                System.out.println(area);
            }
            case "circle" -> {
                double radius = scanner.nextDouble();
                double area = 3.14 * Math.pow(radius, 2);
                System.out.println(area);
            }
            case "triangle" -> {
                double sideA = scanner.nextDouble();
                double sideB = scanner.nextDouble();
                double sideC = scanner.nextDouble();

                double semiPerimeter = (sideA + sideB + sideC) / 2;
                double area = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) *
                        (semiPerimeter - sideB) * (semiPerimeter - sideC));
                System.out.println(area);
            }
            default -> System.out.println("Invalid shape entered!");
        }

        scanner.close();
    }
}
