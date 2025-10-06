package FactoryDesignPatternPractice;

public class Test {
    public static void main (String []args)
    {
        ShapeFactory s1 = new ShapeFactory();
        Shape sb1 = s1.getShape("CIRCLE");
        sb1.getShapeObject();
    }
}
