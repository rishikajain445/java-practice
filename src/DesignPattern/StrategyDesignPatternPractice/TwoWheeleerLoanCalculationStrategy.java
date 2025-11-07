package DesignPattern.StrategyDesignPatternPractice;

public class TwoWheeleerLoanCalculationStrategy implements InterestCalculationStrategy{
    @Override
    public void calculateInterest(int amount) {
        int result = (amount*20*2)/100;
        System.out.println(result);
    }
}
