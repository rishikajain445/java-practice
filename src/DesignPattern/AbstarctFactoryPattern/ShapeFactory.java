package DesignPattern.AbstarctFactoryPattern;

public class ShapeFactory implements AbstarctFactory{

    @Override
    public AShape getShape(String input) {
        if(input == "CIRCLE")
            return new ACircle();
        else
            return new ASquare();
    }

    @Override
    public AColor getColor(String input ) {
        return null;
    }
}
