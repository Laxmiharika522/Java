//Stream class
package COLLECTIONS;

import java.util.Arrays;
import java.util.List;
//There is a class called Arrays which has a method called asList //when we pass the values it is automatically converted to List
//Arrays class implements List interface

public class Demo7 {
    public static void main(String a[]){
        List<Integer> nums= Arrays.asList(4,5,6,7,2);
        //if you want to print all the elements
        //in collections you can directly print objects
        System.out.println(nums); //[4, 5, 6, 7, 2]

        for(int i=0;i<nums.size();i++){
            System.out.println(nums.get(i));
        } //4 5 6 7 2

        for(int n: nums){
            System.out.println(n);
        } //4 5 6 7 2

        //forEach is a method in List interface
        nums.forEach(n->System.out.println(n));
    }
}
