//Up casting and Down casting
package INHERITENCE;

class A1{
    public void show(){
        System.out.println("in A show");
    }
}
class B1 extends A1{
    public void show1(){
        System.out.println("in B show");
    }
}
public class Demo10 {
    public static void main(String a[]){
        //Upcasting

        //A1 obj2= (A1) new B1(); //B1 is implicitly converted to A1
        A1 obj1=new B1(); //implicitly converted so no need to write A1 obj2= (A1) new B1();
        obj1.show(); //no error becuse obj1 is object of B1 and show() has refernce in A1

        //Downcasting
        A1 obj2=new B1(); 
        obj2.show();
        //A1 cannot be able to find show1
        //obj2.show1(); //error:The method show1() is undefined for the type A1.which means obj2 has show1 but it does not have reference in A1
        B1 obj3=(B1) obj2; //obj2 is refrence of A1 is converted to refrence of B1
        obj3.show1(); //show1 is object of B1 and has refernce in B1

        
    }
}
