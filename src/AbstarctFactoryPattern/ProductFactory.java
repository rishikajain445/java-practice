package AbstarctFactoryPattern;

public class ProductFactory {
    public  AbstarctFactory getFactory(String choice)
    {
        if(choice == "SHAPE")
            return  new ShapeFactory();

        else
            return  new ColorFactory();
    }
}
