//if you want to add even numbers after doubling it using Stream interface
/*package COLLECTIONS;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo12 {
    public static void main(String a[]){
        List<Integer> nums = Arrays.asList(2,5,7,6,4);
        Stream<Integer>s1 = nums.stream();
        Stream<Integer>s2 = s1.filter(n->n%2==0);
        Stream<Integer>s3 = s2.map(n->n*2);
        int result = s3.reduce(0,(c,e)->c+e);
        System.out.println(result); //24
    }
}*/

/*package COLLECTIONS;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo12 {
    public static void main(String a[]){
        List<Integer> nums = Arrays.asList(2,5,7,6,4);
        int result = nums.stream().filter(n->n%2==0).map(n->n*2).reduce(0,(c,e)->c+e); //simultaneous method calling
        System.out.println(result); //24
    }
}*/

