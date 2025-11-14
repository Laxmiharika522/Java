//anonymous object
//Used once, for quick method calls.
package OOPS;
class A{
    public A(){
        System.out.println("in constructor");
    }
    public void show(){
        System.out.println("in show");
    }
    public void call(){
        System.out.println("in call");
    }
}
public class Practice9 {
    public static void main(String a[]){
        //object is created inside the heap memory but reference variable is not there so it is called Anonymous object  
        new A(); 
        new A().show();
        new A().call(); //we can call methods with the help of objects
        //here three times object is created . Everytime we say new A() object is created
        //if u have multiple methods better to use named object because everytime default constructor is called when object is created

    }
}
