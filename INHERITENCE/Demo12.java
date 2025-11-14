//abstract class
//the methods which are just declared in one class and implemented in another class is called adstract method
//the class which contains abstract method is called abstract class
//we cant create objects for abstract class
package INHERITENCE;
abstract class Car{
    public abstract void driving();//only declaration
    public void playing_music(){
        System.out.println("playing music");
    }
}
class WagonR extends Car{//the type WagonR must implement the inherited abstract method Car.driving()
    public void driving(){
        System.out.println("in driving");
    } 
}
public class Demo12 {
    public static void main(String a[]){
        Car obj=new WagonR();//we can create reference for abstract class but we cannot create object of abstract class
        obj.driving();
        obj.playing_music(); 
    }
}
