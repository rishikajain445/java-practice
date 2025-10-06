package AbstarctFactoryPattern;

import FactoryDesignPatternPractice.Shape;

public interface AbstarctFactory {
    public AShape getShape(String input);

    public AColor getColor(String input);
}
