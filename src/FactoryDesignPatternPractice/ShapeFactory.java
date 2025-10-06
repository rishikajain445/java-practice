package FactoryDesignPatternPractice;

public class ShapeFactory {

    Shape getShape(String input)
    {
        if(input == "CIRCLE")
            return new Circle();
        else
        {
            return new Square();
        }
    }


}
