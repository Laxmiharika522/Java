//in this Demo20 we will see Abstract class and in Demo21 we will see interface for same code
package INHERITENCE;

abstract class Computer{
    public abstract void code();
}
class Laptop extends Computer{
    public void code(){
        System.out.println("code,compile,run");
    }
}
class Desktop extends Computer{
    public void code(){
        System.out.println("code,compile,run : Faster");
    }
}
class Developer{
    public void develop(Computer obj){//whatever you give either desktop object or laptop object Developer should write the code
        obj.code();
    }
}
public class Demo20 {
    public static void main(String a[]){
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer obj = new Developer();
        obj.develop(lap); //we are giving laptop to user
        // O/P : code,compile,run
        obj.develop(desk); //we are desktop to the user
        // O/P : code,compile,run : Faster
    }
}
