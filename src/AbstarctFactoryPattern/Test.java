package AbstarctFactoryPattern;

import FactoryDesignPatternPractice.ShapeFactory;

public class Test {

    public static  void main (String []args)
    {
        ProductFactory p1= new ProductFactory();
        AbstarctFactory s1 = p1.getFactory("SHAPE");
        AShape sb1 = s1.getShape("CIRCLE");
         sb1.draw();
        ProductFactory p2= new ProductFactory();
        AbstarctFactory s2= p2.getFactory("COLOR");
        AColor sb2 = s2.getColor("RED");
        sb2.fill();

    }
}
