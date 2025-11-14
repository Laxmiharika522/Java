//abstract class(Multilevel)
//abstract contains multiple abstract methods and non-abstract methods
//abstract class sometimes may not contains single abstract method(it works)
//RangeRover class is called concrete class
package INHERITENCE;

abstract class Car{
    public abstract void driving();//only declaration
    public abstract void eating();
    public void playing_music(){
        System.out.println("playing music");
    }
}
abstract class WagonR extends Car{//since WagonR cannot implement all abstract methods so it will become abstract class
    public void driving(){
        System.out.println("in driving");
    } 
}
class RangeRover extends WagonR{//this class is called concrete class
    public void eating(){
        System.out.println("eating while driving");
    }
}
public class Demo13 {
    public static void main(String a[]){
        //Car obj=new WagonR(); //since WagonR becomes abstract class we cannot create objects for WagonR class
        //error: Cannot instantiate the type WagonR
        Car obj=new RangeRover();
        obj.driving(); //in driving
        obj.eating(); //eating while driving
        obj.playing_music();  //playing music
    }
}
