//set interface gives unique values
//HashSet gives unique values but in unsorted order
//TreeSet gives in unique values and in sorted order
/*package COLLECTIONS;

import java.util.HashSet;
import java.util.Set;

class Demo2{
    public static void main(String a[]){
        Set<Integer> nums =new HashSet<Integer>();
        nums.add(51);
        nums.add(620);
        nums.add(84);
        nums.add(10);
        nums.add(51);

        for(int n: nums){
            System.out.println(n);  // 51 84 10 620 not in sorted order
        }
        //we dont have indexes in Set
        //The method get(int) is undefined for the type Set<Integer>
        // System.out.println(nums.get(2));
        // System.out.println(nums.indexOf(6));
    }
}*/

//TreeSet class extends from AbstractSet(class) and implements NavigableSet(interface)
//Navigableset extends SortedSet(interface)
/*package COLLECTIONS;

import java.util.TreeSet;
import java.util.Set;

class Demo2{
    public static void main(String a[]){
        Set<Integer> nums =new TreeSet<Integer>();
        nums.add(51);
        nums.add(620);
        nums.add(84);
        nums.add(10);
        nums.add(51);

        for(int n: nums){
            System.out.println(n);  // 10 51 84 620 //sorted order
        }
        //we dont have indexes in Set
        //The method get(int) is undefined for the type Set<Integer>
        // System.out.println(nums.get(2));
        // System.out.println(nums.indexOf(6));
    }
}*/

//Collection extends Iterator
package COLLECTIONS;


import java.util.Iterator;
import java.util.TreeSet;
import java.util.Set;

class Demo2{
    public static void main(String a[]){
        Set<Integer> nums =new TreeSet<Integer>();
        nums.add(51);
        nums.add(620);
        nums.add(84);
        nums.add(10);
        nums.add(51);

        // for(int n: nums){
        //     System.out.println(n);  // 10 51 84 620 //sorted order
        // }
        
        //Type Parameters:the type of elements returned by this iterator. this case it is Integer 
        //Iterators allow the caller to remove elements from the underlying collection during the iteration
        //iterator() method Returns: an iterator over the elements in this set
        Iterator<Integer> values = nums.iterator(); //values is of type iterator
        while(values.hasNext()){//hasNext() tells do we have net element
            System.out.println(values.next()); //10 51 84 620
        }

    }
}