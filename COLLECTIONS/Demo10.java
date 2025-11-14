//if you want to print all elements using Stream interface
//we use Stream class
//Stream is an interface
//once Stream object is used we cannot use it again
package COLLECTIONS;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo10 {
    public static void main(String a[]){
        List<Integer> nums = Arrays.asList(2,5,7,6,4);
        // stream() is a method in Stream interface. Returns:a sequential Stream over the elements in this collection
        Stream<Integer>s1=nums.stream();
        //whatever the values are there is in nums same values are there in s1;
        //if you change s1 nums will not change
        //Stream objects are used only once
        s1.forEach(n->System.out.println(n)); //prints all the elements
        //we cannot use s1 again
        //s1.forEach(n->System.out.println(n)); //error: java.lang.IllegalStateException: stream has already been operated upon or closed
    }
}

//s1.forEach(n->System.out.println(n)); what is the meaning of this line
//Stream is an functional interface we implemented using lambda function