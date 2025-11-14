//Comparable
//Integer class implements Comparable(interface) so by default sort works for Integer objects
//sort doesnot work for Student1 class
//compareTo is a method in Comparable interface which takes object as parameter
//If you want to give a power to class itself to compare its object by itself we can use Comparable there
package COLLECTIONS;

import java.util.ArrayList;
import java.util.Collections;


import java.util.List;
//References to generic type Comparable<T> should be parameterized
class Student1 implements Comparable<Student1>{
    int age;
    String name;
    public Student1(int age,String name){
        this.age=age;
        this.name=name;
    }
    public String toString(){//toString is method in every class to gives random string value if you print object of this class.Now we are overriding it
        return "Student1 [name : " + name + " age : " + age + "]";
    }
    public int compareTo(Student1 obj1){
        if(this.age>obj1.age){
            return 1;// 1 means swap
        }else{
            return -1;// no swap
        }
    }
}
public class Demo5 {
    public static void main(String a[]){
        List<Student1> stud = new ArrayList<>();
        stud.add(new Student1(90,"Harika"));
        stud.add(new Student1(99,"Santhu"));
        stud.add(new Student1(88,"harsh"));
        stud.add(new Student1(100,"kiran"));
        Collections.sort(stud); //Studen1 class has compareTo method
        for(Student1 s: stud){
            System.out.println(s); //we are printing object of Student1 class
        }

    }
    //O/P:
    // Student1 [name : harsh age : 88]
    // Student1 [name : Harika age : 90]
    // Student1 [name : Santhu age : 99]
    // Student1 [name : kiran age : 100]
}
