//Runnable vs Thread 
//Thread is a class which implements Runnable(interface)
//class A extends Thread implements Runnable // we can say: class A implements Runnable
//start() method is in Thread but not in Runnable
//constructor of Thread class has Runnable object as parameter
// public Thread(Runnable task){}
//we cannot create objects for Runnable we can creater Refernce of Runnable
package EXCEPTIONAL_HANDLING;

class C1 implements Runnable{
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
class D1 implements Runnable {
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
public class Demo12 {
    public static void main(String a[]){
        Runnable obj1 = new C1();
        Runnable obj2 = new D1();

        //start() method is there in Thread class only so we need to create object of Thread class .and Thread class constructor has Runnable object parameter
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        //start() method calls run() method
        t1.start();
        t2.start();

    }
}
