public class Main {
    public static void main(String[] args) {

        double purchasePrice = 50.00;
        double taxRate = 0.05;
        double salesTax = purchasePrice * taxRate;

        System.out.println("Purchase price: $" + purchasePrice);
        System.out.println("Sales tax (5%): $" + salesTax);
    }
}
