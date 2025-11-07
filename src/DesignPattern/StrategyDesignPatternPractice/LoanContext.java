package DesignPattern.StrategyDesignPatternPractice;

public class LoanContext {
    private InterestCalculationStrategy interestCalculationStrategy;

    public void setInterestCalculationStrategy(InterestCalculationStrategy interestCalculationStrategy) {
        this.interestCalculationStrategy = interestCalculationStrategy;
    }

    public void calculation(int amount)
    {
        interestCalculationStrategy.calculateInterest(amount);
    }
}
