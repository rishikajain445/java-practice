package JavaConcept.StreamAPIPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MapPractice {

    public  static  void main (String [] args)
    {
        List<Integer> l1 = Arrays.asList(1,2,3,4,5);
        List<Integer> result =  l1.stream().map(n -> n*n).collect(Collectors.toList());   // to list practice
        System.out.println(result);

        List<String> names = Arrays.asList("alice", "bob", "charlie");
        List<String> result2 = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println(result2);

        List<Integer> result3 = names.stream().map(n-> n.length()).collect(Collectors.toList());
        System.out.println(result3);

        List<String> fruits = Arrays.asList("apple","apple", "banana", "orange");
        Set<String> result4 = fruits.stream().collect(Collectors.toSet());
        System.out.println(result4);

        long countResult = l1.stream().filter(n -> n>3).collect(Collectors.counting());
        System.out.println(countResult);

//        Map<String,Integer>  result5 = fruits.stream().collect(Collectors.toMap(n-> n , n->n.length()));
//        System.out.println(result5);
        Map<String,Integer> result6 = fruits.stream().collect(Collectors.toMap(n->n, n-> n.length(),(existing, replication)-> existing +replication));
        System.out.println(result6);

        Map<Character,Long> result7 = fruits.stream().collect(Collectors.groupingBy(n->n.charAt(0),Collectors.counting()));
        System.out.println(result7);

//        Map<Integer,List<String>> result8 = fruits.stream().collect(Collectors.groupingBy();
//        System.out.println(result8);

    }
}
