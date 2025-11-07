package StrategyDesignPatternPractice;

public class CarLoanCalculationStrategy implements InterestCalculationStrategy{
    @Override
    public void calculateInterest(int amount) {
        int result = (amount *15*10)/100;
        System.out.println(result);
    }
}
