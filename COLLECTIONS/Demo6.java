//lambda comparator
package COLLECTIONS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student2{
    int age;
    String name;
    public Student2(int age,String name){
        this.age=age;
        this.name=name;
    }
    public String toString(){//toString is method in every class to gives random string value if you print object of this class.Now we are overriding it
        return "Student2 [name : " + name + " age : " + age + "]";
    }
}
public class Demo6 {
    public static void main(String a[]){
        //Parameter: the type of objects that may be compared by this comparator
        //incase of anonymous inner class both side we should give Integer
        Comparator<Student2> com = (i,j) -> i.age>j.age?1:-1;
        // {
        //     //return i.age>j.age?1:-1; //single statement no need to write return no need to put curly braces
        // }
        List<Student2> stud = new ArrayList<>();
        stud.add(new Student2(90,"Harika"));
        stud.add(new Student2(99,"Santhu"));
        stud.add(new Student2(88,"harsh"));
        stud.add(new Student2(100,"kiran"));
        Collections.sort(stud,com); //based on age
        for(Student2 s: stud){
            System.out.println(s); //we are printing object of Student2 class
        }
    }
    //o/p:
    // Student2 [name : harsh age : 88]
    // Student2 [name : Harika age : 90]
    // Student2 [name : Santhu age : 99]
    // Student2 [name : kiran age : 100]
}
