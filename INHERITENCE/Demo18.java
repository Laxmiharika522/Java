//INTERFACE

//In Java, an interface is a reference type (like a class) that is used to specify a set of methods that a class must implement. 
//It is a way to achieve abstraction and multiple inheritance.

// Only method declarations, no method bodies (until Java 8).
// Implements keyword is used in the class to implement an interface.
// A class can implement multiple interfaces (Java supports multiple inheritance via interfaces).
// All methods in an interface are public and abstract by default (before Java 8).
// Variables in an interface are public, static, and final (i.e., constants).
package INHERITENCE;

// abstract class X{
//     public abstract void show();
//     public abstract void config();
// }

interface X{
    //every method in interface is public abstract
    //there is only declaration of methods in interface no implementation.Implementation is done in classes
    void show(); //by default it is public abstract void show()
    void config();

}
class Y implements X{//the type Y must implement the all inherited abstract method
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
}
public class Demo18 {
    public static void main(String a[]){
        X obj=new Y();//we cannot create objects for interfaces .interfaces can be used as refernce
        obj.show();//in show
        obj.config();//in config
    }
   
}
