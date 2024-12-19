package Gradient.Finance;



class Stocks {
    private Investment investment;
    private double dividendYield;
    private String marketSector;


    public Stocks(String investmentName, double investmentAmount, double dividendYield, String marketSector) {
        this.investment = new Investment(investmentName, investmentAmount);
        this.dividendYield = dividendYield;
        this.marketSector = marketSector;
    }

    public String getInvestmentName() {
        return investment.getInvestmentName();
    }

    public double getInvestmentAmount() {
        return investment.getInvestmentAmount();
    }

    public double getDividendYield() {
        return dividendYield;
    }

    public void setDividendYield(double dividendYield) {
        this.dividendYield = dividendYield;
    }

    public String getMarketSector() {
        return marketSector;
    }

    public void setMarketSector(String marketSector) {
        this.marketSector = marketSector;
    }

    public void displayStockInfo() {
        System.out.println("Investment Name: " + getInvestmentName());
        System.out.println("Investment Amount: " + getInvestmentAmount());
        System.out.println("Dividend Yield: " + dividendYield);
        System.out.println("Market Sector: " + marketSector);
    }
}