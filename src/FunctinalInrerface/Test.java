package FunctinalInrerface;

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

    }
}
