package JavaConcept.ReflectionPractice;

public class Eagle {

     Eagle(){

    }
    public String  breed;
    private  boolean  canSwim;

    public void  fly()
    {
        System.out.println("can fly");
    }
    public void eat ()
    {
        System.out.println("can eat");
    }
    public void fly(int intParam , boolean boolParam , String strParm)
    {
        System.out.println("fly intParam : " +intParam +"boolParam" +boolParam +"strParam " + strParm);
    }
}
