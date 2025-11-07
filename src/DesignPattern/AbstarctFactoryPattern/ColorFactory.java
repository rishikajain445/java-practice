package DesignPattern.AbstarctFactoryPattern;

public class ColorFactory implements AbstarctFactory{
    @Override
    public AShape getShape(String input) {

        return null;
    }

    @Override
    public AColor getColor(String input) {
     if(input == "RED")
         return new ARed();
     else
     {
         return new ABlue();
     }
    }
}
