//A class can extend another class
//simlarly interface can extend another interface and class implements multiple interfaces
package INHERITENCE;

interface L1{
    void show();
}
interface L2{
    void show1();
}
interface L3 extends L1,L2{ //multiple inheritence
    //u will have show1() and show() method in this interface due to inheritence
}
class L4 implements L3{//here multiple inheritence is possible
    public void show(){
        System.out.println("in V1 show");
    }
    public void show1(){
        System.out.println("in V2 show");
    }
}
public class Demo23 {
    public static void main(String a[]){
        L3 obj1 = new L4();
        obj1.show(); //in V1 show
        obj1.show1(); //in V2 show
    }

}

