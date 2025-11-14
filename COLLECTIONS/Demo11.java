//print all even elements using Stream interface
package COLLECTIONS;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo11 {
    public static void main(String a[]){
        List<Integer> nums = Arrays.asList(2,5,7,6,4);
        Stream<Integer>s1 = nums.stream();
        Stream<Integer>s2 = s1.filter(n->n%2==0);
        s2.forEach(n->System.out.println(n));//2 6 4
    }
}

