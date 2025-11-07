package StrategyDesignPatternPractice;

public class HomeLoanCalculationStrategy implements InterestCalculationStrategy{
    @Override
    public void calculateInterest(int amount) {
        int result = (amount*10*2)/100;
        System.out.println(result);
    }
}
