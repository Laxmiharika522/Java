//collection API framework
//Collection (interface)
//Collections (class)

//The Collection interface in Java is a core member of the Java Collections Framework located in the java.util package.
//Collection is an interface
//List is an interface extends Collection(interface)
//ArrayList(class) implements List
/*package COLLECTIONS;

import java.util.ArrayList;
import java.util.Collection;

class Demo1{
    public static void main(String a[]){
        Collection nums =new ArrayList(); //collection is an interface so we cannot create object for for but we can create reference for that
        //The method add(Object) belongs to the raw type Collection.
        //5,6,8,10 are not integers they are objects
        nums.add(5);
        nums.add(6);
        nums.add(8);
        nums.add(10);
        System.out.println(nums);//we can directly print Collection
        //there is slight complie time error but there is output
        //Note: COLLECTIONS\Demo1.java uses unchecked or unsafe operations.
        // Note: Recompile with -Xlint:unchecked for details.
        //[5, 6, 8, 10]

    }
}*/

/*package COLLECTIONS;

import java.util.ArrayList;
import java.util.Collection;

class Demo1{
    public static void main(String a[]){
        Collection nums =new ArrayList();
        //The method add(Object) belongs to the raw type Collection.
        //5,6,8,10 are not integers they are objects
        nums.add(5); //automaticllay primitive data type integer is converted to Integer object --->auto boxing
        nums.add(6);
        nums.add(8);
        nums.add(10);
        //nums.add("Hi"); //it gives run time error


        for(Object n: nums){//printing one by one
            int num =(Integer) n; //auto-unboxing
            System.out.println(num*2);
        }
        // for(int i: nums){ error: Type mismatch: cannot convert from element type Object to int
        //     System.out.println(i);
        // }
        //System.out.println(nums);
        //there is slight complie time error but there is output
        //Note: COLLECTIONS\Demo1.java uses unchecked or unsafe operations.
        // Note: Recompile with -Xlint:unchecked for details.
        //[5, 6, 8, 10]

    }
}*/

//<Integer> mentioning in angular brackets is called generics.To avoid run time errors
/*package COLLECTIONS;

import java.util.ArrayList;
import java.util.Collection;

class Demo1{
    public static void main(String a[]){
        //The Integer class wraps a value of the primitive type int in an object.
        Collection<Integer> nums =new ArrayList<Integer>(); //we are specifiaclly saying that object is Integer 
        nums.add(5); //automaticllay primitive data type integer is converted to Integer object --->auto boxing
        nums.add(6);
        nums.add(8);
        nums.add(10);
        //nums.add("Hi"); //it gives compile time error error

        // for(Integer n: nums){//printing one by one
        //     int num = n; //auto-unboxing
        //     System.out.println(num*2); //works correctly
        // }

        // for(Object n: nums){//printing one by one .
        //     int num = (Integer)n; //int cannot recognise Object so we are type casting it to Integer
        //     System.out.println(num*2); 
        // }

        for(int n: nums){//since we declared <Integer> //auto - unboxing
            System.out.println(n);
        }
    }
}*/


//in collection interface we cannot use indexes so we use in List interface
package COLLECTIONS;

import java.util.ArrayList;
import java.util.List;

class Demo1{
    public static void main(String a[]){
        //List extends from Collection and has some extra methods
        List<Integer> nums =new ArrayList<Integer>();
        nums.add(5);
        nums.add(6);
        nums.add(8);
        nums.add(10);

        for(int n: nums){//works because of auto-unboxing:
        //Each Integer in the list is automatically converted to a primitive int.
            System.out.println(n*2); 
        }
        System.out.println(nums.get(2));//8
        System.out.println(nums.indexOf(6));//1
    }
}

