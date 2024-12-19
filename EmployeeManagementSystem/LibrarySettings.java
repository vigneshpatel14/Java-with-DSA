package EmployeeManagementSystem;

class LibrarySettings {
    private int MaxArticles , LoanPeriod;

    public LibrarySettings(int maxArticles , int loanPeriod)
    {
        this.MaxArticles = maxArticles;
        this.LoanPeriod = loanPeriod;
    }

    public int getLoanPeriod() {
        return LoanPeriod;
    }

    public int getMaxArticles() {
        return MaxArticles;
    }

    public void setLoanPeriod(int loanPeriod) {
        LoanPeriod = loanPeriod;
    }

    public void setMaxArticles(int maxArticles) {
        MaxArticles = maxArticles;
    }
}
