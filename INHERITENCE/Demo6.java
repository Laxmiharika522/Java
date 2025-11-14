//Dynamic method dispatch
//parent refernce child object because child can access both parernt and child class properties 
package INHERITENCE;

class E {
    public void show(){
        System.out.println("in E show");
    }
    public void show1(){
        System.out.println("in parent class");
    }
}
class F extends E {
    public void show(){
        System.out.println("in F show");
    }
}
class G extends E{
    public void show(){
        System.out.println("in G show");
    }
}
public class Demo6 {
    public static void main(String a[]){

        E obj = new F(); //obj is the refernce of E class and F is the object
        obj.show(); //obj is object of F so output will be " in F show "
        obj.show1(); //we can acess methods of parent class also because child class is inherited from parent class

        //you can have child objects for parent refernce
        //G is derived from E class so G always contains all the properties of E
        //but E will be or will not contains all the properties of G class so that why we cannot (create object of G )
        //parent class -> refernce 
        //derived class -> object 
        E obj1 = new G();
        obj1.show();
    }
}
