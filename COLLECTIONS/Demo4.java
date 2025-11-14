//Comparator and Comparable
//we have Collections class which has some methods(sort)
package COLLECTIONS;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Demo4 {
    public static void main(String a[]){
        //if you provide type of List in Right hand side is fine no need to give on Left hand side(optial)
        //List<Integer> nums = new ArrayList<Integer>();//left hand side is optional
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(29);
        nums.add(15);
        nums.add(2);
        Collections.sort(nums);
        for(int i: nums){
            System.out.println(i); //2 5 15 29
        }
    }
}

//Comparator: If we want to write our own comparision logic we use custom comparator
//Comparator is an interface
//we wont to compare based on last digit
/*package COLLECTIONS;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo4 {
    public static void main(String a[]){
        //Parameter: the type of objects that may be compared by this comparator
        //incase of anonymous inner class both side we should give Integer
        Comparator<Integer> com = new Comparator<Integer>() //since Comparator is interface we should create anonymous inner class
        {
            public int compare(Integer i,Integer j){
                if(i%10>j%10){
                    return 1;// 1 means swap
                }else{
                    return -1;// no swap
                }
            }
        };
        List<Integer> nums = new ArrayList<>();
        nums.add(54);
        nums.add(29);
        nums.add(15);
        nums.add(21);
        Collections.sort(nums,com); //based on last digit
        for(int i: nums){
            System.out.println(i); //21 54 15 29
        }
    }
}*/

//example 2

/*package COLLECTIONS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int age;
    String name;
    public Student(int age,String name){
        this.age=age;
        this.name=name;
    }
    public String toString(){//toString is method in every class to gives random string value if you print object of this class.Now we are overriding it
        return "Student [name : " + name + " age : " + age + "]";
    }
}
public class Demo4 {
    public static void main(String a[]){
        //Parameter: the type of objects that may be compared by this comparator
        //incase of anonymous inner class both side we should give Integer
        Comparator<Student> com = new Comparator<Student>() //since Comparator is interface we should create anonymous inner class
        {
            public int compare(Student i,Student j){
                if(i.age>j.age){
                    return 1;// 1 means swap
                }else{
                    return -1;// no swap
                }
            }
        };
        List<Student> stud = new ArrayList<>();
        stud.add(new Student(90,"Harika"));
        stud.add(new Student(99,"Santhu"));
        stud.add(new Student(88,"harsh"));
        stud.add(new Student(100,"kiran"));
        Collections.sort(stud,com); //based on age
        for(Student s: stud){
            System.out.println(s); //we are printing object of Student class
        }
    }
}*/



