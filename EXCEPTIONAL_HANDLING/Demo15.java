//race condition solution
//t1 and t2 both reaching to count at the same time.They both got the value which is for example 3 they both said 3+1=4 . we got two iterations. we called increment two times(from two different objects) but the increment happens only one time.(that's why if there are 200 iterations but the count is still 170)
//That's what happens when you have two threads working with the same variable 
//synchronized keyword: Locks the method or block for one thread at a time
package EXCEPTIONAL_HANDLING;

class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}

public class Demo15 {
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


        
        System.out.println(c.count); //200

    }
}

