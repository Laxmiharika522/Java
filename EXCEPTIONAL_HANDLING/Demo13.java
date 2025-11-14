//lambda expression for Runnable
//if we are using classes C1 and D1 just for run() method no need to create classes we can use anonymous inner class
package EXCEPTIONAL_HANDLING;


// class C1 implements Runnable{
//     public void run(){
//         for(int i=1;i<=10;i++){
//             System.out.println("hi");
//             //Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds,
//             try{
//                 Thread.sleep(10);
//             }
//             catch(InterruptedException e){
//                 e.getStackTrace();
//             }
//         }
//     }
// }
// class D1 implements Runnable {
//     public void run(){
//          for(int i=1;i<=10;i++){
//             System.out.println("hello");
//             //Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds,
//             try{
//                 Thread.sleep(10);
//             }
//             catch(InterruptedException e){
//                 e.getStackTrace();
//             }
//         }
//     }
// }
public class Demo13 {
    public static void main(String a[]){
        Runnable obj1 = () -> 
        {
            for(int i=1;i<=10;i++){
                System.out.println("hi");
                
                try{
                    Thread.sleep(10);
                }
                catch(InterruptedException e){
                    e.getStackTrace();
                }
            }
        };
        Runnable obj2 = () -> 
        {
            for(int i=1;i<=10;i++){
                System.out.println("hello");
                
                try{
                    Thread.sleep(10);
                }
                catch(InterruptedException e){
                    e.getStackTrace();
                }
            }
        };
        //start() method is there in Thread class only so we need to create object of Thread class .and Thread class constructor has Runnable object parameter
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        //start() method calls run() method
        t1.start();
        t2.start();

    }
}
