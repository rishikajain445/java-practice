package JavaConcept.ReflectionPractice;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Practice {

    public static void main (String []args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {

      Class eagleobj = Eagle.class;

      System.out.println(eagleobj.getName());
      System.out.println(Modifier.toString(eagleobj.getModifiers())); // will tell class modifier


      //------------------------- Reflection on methods

     Method[] methods = eagleobj.getMethods(); //all public method will come  , it will give public method of super class objet
     for(Method method : methods)
     {
         System.out.println(method.getName());
         System.out.println(method.getReturnType());
         System.out.println(method.getDeclaringClass());
         System.out.println("******");

     }

     //  now if want to fetch all public and private class of eagle only

      Method[] methods1 = eagleobj.getDeclaredMethods();
     for(Method m : methods1){
         System.out.println(m.getName());

     }
    //  Invoking the method using reflection

     Class eagleClass = Class.forName("Eagle");
     Object eagleobject = eagleClass.newInstance();
     Method flymethod = eagleClass.getMethod("fly",int.class,boolean.class,String.class);
     flymethod.invoke(eagleobject,1,true,"hellio");

     //reflection of fields
        Field[] feilds = eagleClass.getFields();
        for(Field f: feilds){
            System.out.println(f.getName());
        }

        // setting the value of public feild
         Field feild = eagleClass.getDeclaredField("breed");
        Eagle eg = new Eagle();
        feild.set(eg,"eagleBreed");
        System.out.println(eg.breed);

        //setting in private field
        Field f = eagleClass.getDeclaredField("canSwim");
        f.setAccessible(true);// this will allow  permission to even access the private fields
        f.set(eagleobj,true);

        //private constructor(singleton class break issue )
         //as private constructor will not allow to create object but class aloow accessible to ut thus can still create instance thus breaking the behaviour



  }
}
