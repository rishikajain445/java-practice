package JavaConcept.MarkerInterfacePracice;

public class Test {

    public static void main(String []args)
    {
        Access ac = new Access();
        Object str = "Rishika";

        if(ac instanceof PermissionGranted)
            System.out.println("Permission granted");
        else
        {
            System.out.println("Permissin Denied");
        }

        if(str instanceof PermissionGranted)
            System.out.println("Permission granted");
        else
            System.out.println("Permission denied");
    }
}
