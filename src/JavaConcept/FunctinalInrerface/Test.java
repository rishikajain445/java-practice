package JavaConcept.FunctinalInrerface;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Test {

    public static void main (String []args)
    {
        Custom c1 = ()->System.out.println("Hello");  // Implementing a custom interface
        c1.test();


        // Built in Functional Interface
        //function <T,R>
        Function <String,Integer> f1 = n->n.length();
        System.out.println(f1.apply("Rishika"));

        //Consumer<T>
        Consumer<Integer> c2 = i-> System.out.println(2*i);
        c2.accept(10);

        //Supplier<R>
        Supplier<String> s1 = ()-> "Hello";
        System.out.println(s1.get());

        //Predicate<T>
        Predicate<Integer> p1 = n->n>2;
        System.out.println(p1.test(3));

        //BiFunction<T,U,R>

        BiFunction<Integer,Integer,Integer> b1 = (a,b)->a*b;
        System.out.println(b1.apply(10,20));

        //UnaryOperator<T,T>
        UnaryOperator<Integer> u1 = n->n*n;
        System.out.println(u1.apply(10));

        //BinaryOperator<T,T,T>
        BinaryOperator<Integer> b2 = (a,b)->a*b;
        System.out.println(b2.apply(10,20));


        //combine two function
        Function<Integer,Integer> multiply = n-> n*2;
        Function<Integer,Integer> add = n->n+10;
        System.out.println(multiply.andThen(add).apply(5));
        System.out.println(multiply.compose(add).apply(5));


       // chain multiple Predicates using and(), or(), and negate()

        List<Integer> l2 = Arrays.asList(1,2,3,4);
        Predicate<Integer> even = n-> n%2==0;
        Predicate<Integer> greater = n-> n>3;
       List<Integer> result2 =  l2.stream().filter(even.and(greater)).toList();
       List<Integer> result3 = l2.stream().filter(even.or(greater)).toList();
       List<Integer> result4 = l2.stream().filter(even.negate()).toList();


        //------------------------  practice questions
        //----reverse a string using function
        Function<String,String> f5 = s-> new StringBuilder(s).reverse().toString();
        System.out.println(f5.apply("Rishika"));

        // ---predicate + stream (filter list of integers based on even old )

        List<Integer> l1 = Arrays.asList(1,2,3,4);
        Predicate<Integer> p5 = n->n%2==0;
        List<Integer> result = l1.stream().filter(p5).toList();// in this filter will explicitly calls test of p5
        System.out.println(result);

        // ---Consumer to print all elements of a list

        Consumer<Integer> c5 = n->System.out.println(n);
        l1.forEach(c5);

        // -- BiFunction to combine two strings and return their concatenated length

         BiFunction<String,String,String> s4 = (a,b)->a+b;
         System.out.println(s4.apply("Rishika","Jain"));




    }
}
