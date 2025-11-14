//setPriority(int) sets a thread’s priority (1 to 10).
//Higher priority threads may run before lower ones.
//Priorities help the scheduler decide, but don't guarantee execution order.
//Thread priorities are just suggestions to the thread scheduler.
//The actual behavior may vary by OS and JVM. Some systems may ignore priorities.
//Priorities are not a guarantee of execution order — use them for hints, not control.
package EXCEPTIONAL_HANDLING;

class E extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("hi");
        }
    }
}
class F extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("hello");
        }
    }
}
public class Demo10 {
    public static void main(String a[]){
        E obj1 = new E();
        F obj2 = new F();

        //using priority you can suggest what should be done . 
        obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        obj2.start();
    }
}
