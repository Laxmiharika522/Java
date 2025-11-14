//need of interface
// A class can implement multiple interfaces (Java supports multiple inheritance via interfaces).

package INHERITENCE;

interface V1{
    void show();
}
interface V2{
    void show1();
}
class V3 implements V1,V2{//here multiple inheritence is possible
    public void show(){
        System.out.println("in V1 show");
    }
    public void show1(){
        System.out.println("in V2 show");
    }
}
public class Demo22 {
    public static void main(String a[]){
        V1 obj1 = new V3();
        obj1.show(); //in V1 show
        //obj1.show1();//error: The method show1() is undefined for the type V1
        V2 obj2 = new V3();
        obj2.show1(); //in V2 show
    }

}
