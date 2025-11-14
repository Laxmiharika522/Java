//this method
//this method calls the constructor of same class
package INHERITENCE;

class C extends Object{ //by default extends Object will be there but it is invisible
    public C(){
        super();//by default it will be there but it is invisible
        System.out.println("In A");
    }
    public C(int x){
        super();
        System.out.println("In parameterised constructor of base class");
    }
}
class D extends C{
    public D(){
        super();
        System.out.println("In B");
    }
    public D(int k){
        this();//calls the default constructor of same class 
        System.out.println("In parameterised constructor of derived class");
    }
}
public class Demo4 {
    public static void main(String a[]){
        D obj1 = new D(5); //calling parameterised constructor
    }
}
// O/P:   In A
        //In B
        //In parameterised constructor of derived class
