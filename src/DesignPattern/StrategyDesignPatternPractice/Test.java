package DesignPattern.StrategyDesignPatternPractice;

public class Test {
    public static void main(String[] args) {
        LoanContext loanContext = new LoanContext();

        loanContext.setInterestCalculationStrategy(new HomeLoanCalculationStrategy());
        loanContext.calculation(100);
    }
}
