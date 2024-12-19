package Gradient.Finance;


class Bonds {
    private Investment investment;
    private String maturityDate;
    private double couponRate;

    public Bonds(String investmentName, double investmentAmount, String maturityDate, double couponRate) {
        this.investment = new Investment(investmentName, investmentAmount);
        this.maturityDate = maturityDate;
        this.couponRate = couponRate;
    }

    public String getInvestmentName() {
        return investment.getInvestmentName();
    }

    public double getInvestmentAmount() {
        return investment.getInvestmentAmount();
    }

    public String getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(String maturityDate) {
        this.maturityDate = maturityDate;
    }

    public double getCouponRate() {
        return couponRate;
    }

    public void setCouponRate(double couponRate) {
        this.couponRate = couponRate;
    }

    public void displayBondInfo() {
        System.out.println("Investment Name: " + getInvestmentName());
        System.out.println("Investment Amount: " + getInvestmentAmount());
        System.out.println("Maturity Date: " + maturityDate);
        System.out.println("Coupon Rate: " + couponRate);
    }
}