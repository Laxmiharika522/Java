//default and 
package OOPS; 
class Human3{
    private int age;
    private String name;

    public Human3(){//default values
        age=10;
        name="laxmi";
        System.out.println("default constructor is called");
    }

    public Human3(int age,String name){//parametarized constructor
        this.age=age;
        this.name=name;
    }

    public Human3(String name){
        this.age=12;//default
        this.name=name;//from parameter
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class Practice8 {
    public static void main(String a[]){
        Human3 obj1=new Human3(); //constructor is called automatically when the object is created
        System.out.println(obj1.getAge() + " : " + obj1.getName()); // default constructor is called 10 : laxmi

        Human3 obj2=new Human3(18,"Santhu");
        System.out.println(obj2.getAge() + " : " + obj2.getName()); // 18 : Santhu

        Human3 obj3=new Human3("Monkey");
        System.out.println(obj3.getAge() + " : " + obj3.getName()); // 10 : Monkey
    }
}
