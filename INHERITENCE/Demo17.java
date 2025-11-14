////Anonymous(without name) inner class in case of abstract class
//if u have multiple abstract methods you can implement by using Anonymous inner class
package INHERITENCE;

abstract class Cab{
    public abstract void call();
    public abstract void driving();

}
//if you are creating class just to implement abstract method no need to create class we can use anonymous inner class
// class Passenger extends Cab{
//     public void call(){
//         System.out.println("calling cab");
//     }
// }
public class Demo17 {
    public static void main(String a[]){
        Cab obj=new Cab()//here we are not creating object of Cab we are creating object of Anonymous inner class internally
        {
            public void call(){
                System.out.println("calling cab");
            }
            public void driving(){
                 System.out.println("driving cab");
            }
        };
        obj.call();//calling cab
        obj.driving();//driving cab
    }
}
