package ExcptionHandling;

public class Test {
    public static void main (String [] args) throws AgeRestrictionException
    {
        int age = 17;
        if(age < 18)
        {
            throw  new AgeRestrictionException("Age is not valid");
        }
        else {
            System.out.println("Valid age");
        }
    }
}
