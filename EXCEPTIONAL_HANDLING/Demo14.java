//Race Condition
//we are expecting t1 and t2 complete there work and main method we print count finally nut that is not the case.
//when two threads are running any case .Main says my job is done I have started these two threads and now I will simply print the count
//Because of count execcuting earlier then the actual completion of loops the count value changes or count value will be zero.

// t1.start(); and t2.start(); only start the threads.
// The main thread immediately continues to the System.out.println(c.count); line.
// But the threads haven't had time to increment the count yet, so the printed value is 0.
//so we use join() method

package EXCEPTIONAL_HANDLING;

class Counter{
    int count;
    public void increment(){
        count++;
    }
}

public class Demo14 {
    public static void main(String a[]){
        Counter c= new Counter();
        Runnable obj1 = () -> 
        {
            for(int i=1;i<=100;i++){
                c.increment();
                
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
            for(int i=1;i<=100;i++){
                c.increment();
                
                try{
                    Thread.sleep(10);
                }
                catch(InterruptedException e){
                    e.getStackTrace();
                }
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //actually output should be 200 but we are getting 170 only
        System.out.println(c.count); //170 race condition

    }
}
