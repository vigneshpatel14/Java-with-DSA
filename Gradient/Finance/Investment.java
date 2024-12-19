package Gradient.Finance;

class Investment {
    private String investmentName;
    private double investmentAmount;

    public Investment(String investmentName, double investmentAmount) {
        this.investmentName = investmentName;
        this.investmentAmount = investmentAmount;
    }

    public String getInvestmentName() {
        return investmentName;
    }

    public void setInvestmentName(String investmentName) {
        this.investmentName = investmentName;
    }

    public double getInvestmentAmount() {
        return investmentAmount;
    }

    public void setInvestmentAmount(double investmentAmount) {
        this.investmentAmount = investmentAmount;
    }
}