//threads 
//threads execute parallely
// A thread is a path of execution within a program. Java supports multithreading, 
// which means you can run multiple threads simultaneously, making applications faster and more responsive.
//start()	Starts a thread and calls the run() method
//every class which extends Thread class will contain run() method
package EXCEPTIONAL_HANDLING;
class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("hi");
        }
    }
}
class C extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("hello");
        }
    }
}
public class Demo9 { //generally after completion of complete excution of Line 27 it goes to Line 28 . But we are using threads so Line 27 and 28 execute simultaneously
    public static void main(String a[]){
        B obj1 = new B();
        C obj2 = new C();

        obj1.start();
        obj2.start();
    }
}
