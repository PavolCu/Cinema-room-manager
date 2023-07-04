import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Number of companies

        int[] incomes = new int[n];
        for (int i = 0; i < n; i++) {
            incomes[i] = scanner.nextInt(); // Yearly incomes
        }

        int[] taxes = new int[n];
        for (int i = 0; i < n; i++) {
            taxes[i] = scanner.nextInt(); // Individual taxes
        }

        int highestTaxCompany = 1; // Initialize the company with the highest tax
        double highestTaxPayment = (incomes[0] * taxes[0]) / 100.0; // Calculate the tax payment for the first company

        for (int i = 1; i < n; i++) {
            double taxPayment = (incomes[i] * taxes[i]) / 100.0; // Calculate the tax payment for the current company

            if (taxPayment > highestTaxPayment) {
                highestTaxPayment = taxPayment;
                highestTaxCompany = i + 1;
            }
        }

        System.out.println(highestTaxCompany);
    }
}