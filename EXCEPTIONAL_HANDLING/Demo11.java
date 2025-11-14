//sleep method (will give alternative hi and hello)
//sleep method throws InterruptedExecution(checked exception) we can use try and catch or throws
package EXCEPTIONAL_HANDLING;

class A1 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("hi");
            //Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds,
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.getStackTrace();
            }
        }
    }
}
class B1 extends Thread{
    public void run(){
         for(int i=1;i<=10;i++){
            System.out.println("hello");
            //Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds,
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.getStackTrace();
            }
        }
    }
}
public class Demo11 {
    public static void main(String a[]){
        A1 obj1 = new A1();
        B1 obj2 = new B1();

        obj1.start();
        //again there is a chance two get two hi's or hello's at one particular to avoid that also we use sleep here after calling one object
        try{
            Thread.sleep(2);
        }
        catch(InterruptedException e){
            e.getStackTrace();
        }
        obj2.start();
    }
}
