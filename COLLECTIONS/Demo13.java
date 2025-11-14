//explaination Demo12

//Stream<Integer>s2 = s1.filter(n->n%2==0); //what does this statement mean
/*package COLLECTIONS;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo13 {
    public static void main(String a[]){
        List<Integer> nums = Arrays.asList(2,5,7,6,4);
        Stream<Integer>s1 = nums.stream();

        //Stream<Integer>s2 = s1.filter(n->n%2==0);

        //filter method returns the new stream
        //java.util.stream.Stream.filter(Predicate<? super Integer> predicate)
        //filter method need Predicate object.
        //Predicate is a functional interface so we can implement lambda function
        //[Predicate consits of test(T t) method where t is a object 

        Predicate<Integer> p= new Predicate<Integer>(){
            public boolean test(Integer n){
                if(n%2==0){
                    return true;
                }else{
                    return false;
                }
            }
        };
        Stream<Integer>s2 = s1.filter(p);
        s2.forEach(n->System.out.println(n));// 2 6 4

    }
}*/

//convert Predicate interface to lambda expression
/*package COLLECTIONS;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo13 {
    public static void main(String a[]){
        List<Integer> nums = Arrays.asList(2,5,7,6,4);
        Stream<Integer>s1 = nums.stream();

        //Stream<Integer>s2 = s1.filter(n->n%2==0);

        //filter method returns the new stream
        //java.util.stream.Stream.filter(Predicate<? super Integer> predicate)
        //filter method need Predicate object.
        //Predicate is a functional interface so we can implement lambda function
        //[Predicate consits of test(T t) method where t is a object 


        // Predicate<Integer> p= (Integer n)->
        // {
        //         // if(n%2==0){
        //         //     return true;
        //         // }else{
        //         //     return false;
        //         // }
        //         return n%2==0?true:false; //ternary operator
        // };//single line statements no need curly braces and return keyword. we can remove Integer also .since there is one variable n we can remove round brackets also 
        //Predicate<Integer> p= n->n%2==0;


        Stream<Integer>s2 = s1.filter(n->n%2==0);
        s2.forEach(n->System.out.println(n));// 2 6 4

    }
}*/



//Stream<Integer>s3 = s2.map(n->n*2);
/*package COLLECTIONS;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Demo13 {
    public static void main(String a[]){
        List<Integer> nums = Arrays.asList(2,5,7,6,4);
        Stream<Integer>s1 = nums.stream();
        Stream<Integer>s2 = s1.filter(n->n%2==0);

        //Stream<Integer> s3 = s2.map(n->n*2);

        //map method returns the new stream
        //Stream<Integer> java.util.stream.Stream.map(Function<? super Integer, ? extends Integer> mapper)
        //filter method need Function object.
        //Function is a functional interface so we can implement lambda function
        //Function consits of apply(T t) method where t is a object 

        Function<Integer,Integer> f= new Function<Integer,Integer>(){
            public Integer apply(Integer n){
                return n*2;
            }
        };
        Stream<Integer>s3 = s2.map(f);
        s3.forEach(n->System.out.println(n));// 4 12 8
    }
}*/


//convert Function interface into lambda function
/*package COLLECTIONS;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo13 {
    public static void main(String a[]){
        List<Integer> nums = Arrays.asList(2,5,7,6,4);
        Stream<Integer>s1 = nums.stream();
        Stream<Integer>s2 = s1.filter(n->n%2==0);

        //Stream<Integer> s3 = s2.map(n->n*2);

        //map method returns the new stream
        //Stream<Integer> java.util.stream.Stream.map(Function<? super Integer, ? extends Integer> mapper)
        //filter method need Function object.
        //Function is a functional interface so we can implement lambda function
        //Function consits of apply(T t) method where t is a object 

        //Function<Integer,Integer> f= n -> n*2;
        
        Stream<Integer>s3 = s2.map(n->n*2);
        s3.forEach(n->System.out.println(n));// 4 12 8
    }
}*/



//int result = s3.reduce(0,(c,e)->c+e);
/*package COLLECTIONS;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo13 {
    public static void main(String a[]){
        List<Integer> nums = Arrays.asList(2,5,7,6,4);
        Stream<Integer>s1 = nums.stream();
        Stream<Integer>s2 = s1.filter(n->n%2==0);
        Stream<Integer>s3 = s2.map(n->n*2);

        //reduce(Integer identity, BinaryOperator<Integer> accumulator)
        //Returns : the result of the reduction which is in integer
        //BinaryOperator is a Functional interface
        int result = s3.reduce(0,(c,e)->c+e);
        System.out.println(result); //24
    }
}*/