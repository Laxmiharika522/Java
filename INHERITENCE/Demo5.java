//Method overriding
package INHERITENCE;

class Calc2 {
    public int add(int n1,int n2){
        return n1+n2;
    }
}

class Advcalc2 extends Calc2 {
    public int add(int n1,int n2){//derived class methods override the parent class methods automatically
        return n1+n2+10;
    }
    
}

public class Demo5 {
    public static void main(String a[]){
        Advcalc2 obj1=new Advcalc2();
        System.out.println(obj1.add(5,6)); //5+6+10=21
    }
}