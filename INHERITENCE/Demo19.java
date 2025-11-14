//instance variables in interface
// Variables in an interface are public, static, and final (i.e., constants).
package INHERITENCE;

interface X1{
    //int age;// error: The blank final field age may not have been initialized
    //you should defenately intialize it
    int age=12;
    String area="Mumbai"; //we need to defenately intialize the variables in interface
    
    void show(); //by default it is public abstract void show()
    void config();

}
//implements means it will inherit only methods not variables
class Y1 implements X1{//the type Y must implement the all inherited abstract method
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
}
public class Demo19 {
    public static void main(String a[]){
        X1 obj = new Y1();//we cannot create objects for interfaces .interfaces can be used as refernce
        //static variables can be called by class names or interface names
        //X1.age=12; //error: The final field X1.age cannot be assigned

        System.out.println(X1.age); //12;
        System.out.println(X1.area); //Mumbai
        obj.show();//in show
        obj.config();//in config
    }
   
}

