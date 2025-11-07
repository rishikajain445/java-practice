package DesignPattern.AbstarctFactoryPattern;

public interface AbstarctFactory {
    public AShape getShape(String input);

    public AColor getColor(String input);
}
