package Gradient.Finance;


public class Test {
    public static void main(String[] args) {
        Stocks appleStock = new Stocks("Apple Inc.", 1500.0, 2.5, "Technology");
        Bonds governmentBond = new Bonds("US Gov Bond", 5000.0, "2030-01-01", 3.0);

        appleStock.displayStockInfo();

        governmentBond.displayBondInfo();
    }
}
