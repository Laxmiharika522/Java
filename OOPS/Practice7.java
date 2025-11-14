//constructor
package OOPS; 
class Human2{
    private int age;
    private String name;
    public Human2(){//default values
        age=10;
        name="laxmi";
        System.out.println("default constructor is called");
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class Practice7 {
    public static void main(String a[]){
        Human2 obj1=new Human2(); //constructor is called automatically when the object is created
        System.out.println(obj1.getAge() + " : " + obj1.getName()); // default constructor is called 10 : laxmi
    }
}
