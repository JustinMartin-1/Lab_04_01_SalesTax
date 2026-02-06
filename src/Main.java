public class Main {
    public static void main(String[] args) {

        double purchasePrice = 100.00; // Simulating Input
        final double taxRate = 0.05;
        double salesTax = 0;
        double totalPrice = 0;

        salesTax = purchasePrice * taxRate;
        totalPrice = purchasePrice + salesTax;

        System.out.println("sales tax: $" + salesTax);
        System.out.println("Total price: $" + totalPrice);

    }
}
