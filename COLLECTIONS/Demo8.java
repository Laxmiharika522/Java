//how forEach method works
package COLLECTIONS;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Demo8 {
    public static void main(String a[]){
        List<Integer> nums= Arrays.asList(4,5,6,7,2);

        //nums.forEach(n->System.out.println(n));

        // forEach method requries Consumer class object as a parameter
        // Consumer interface(functional interface) contains accept() method
        //accept() method will accept Integer object or integer value(type casted automatically)

        //forEach(Consumer<? super Integer> action)
        //Consumer<T> //T means type . Represents an operation that accepts a single input argument and returns no result.
        //accept(T t)//requries an object or value

        Consumer<Integer> con = new Consumer<Integer>()//Integer is a parameter
        {
            public void accept(Integer n){
                System.out.println(n);
            }

        };
        nums.forEach(con);//works fine
    }
}

//since Consumer is an functional interface we can use lambda expression
/*package COLLECTIONS;

import java.util.Arrays;
import java.util.List;

public class Demo8 {
    public static void main(String a[]){
        List<Integer> nums= Arrays.asList(4,5,6,7,2);

        //nums.forEach(n->System.out.println(n));

        //lambda expression
        // Consumer<Integer> con = (Integer n) -> 
        // {
        //         System.out.println(n); //since there is single statement we can remove curly braces and we can remove Integer .
                                          //since there is one variable we can remove round brackets also
        // };

        // Consumer<Integer> con = n -> System.out.println(n);

        nums.forEach( n -> System.out.println(n));//works fine
    }
}*/
