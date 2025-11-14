//final keyword
package INHERITENCE;

//final variable
/*public class Demo7 {
    public static void main(String a[]){
        final int age=12;
        age=13; // Error: The final local variable age cannot be assigned.
        System.out.println(age);
    }
}*/

//final class
/*final class Calc1 {
    public void show(){
        System.out.println("in Calc1");
    }
    public int add(int n1,int n2){
        return n1+n2;
    }
}

class Advcalc1 extends Calc1 { //error: The type Advcalc1 cannot subclass the final class Calc1
    public void show(){
        System.out.println("in Calc2");
    }
}

public class Demo7 {
    public static void main(String a[]){
        Advcalc1 obj1=new Advcalc1();
        obj1.show();
    }
}*/

//final method
//final method stops method overriding parent class method only called
/*class Calc1 {
    final public void show(){
        System.out.println("in Calc1");
    }
    public int add(int n1,int n2){
        return n1+n2;
    }
}

class Advcalc1 extends Calc1 { 
    public void show(){ //error: Cannot override the final method from Calc1
        System.out.println("in Calc2");
    }
}

public class Demo7 {
    public static void main(String a[]){
        Advcalc1 obj1=new Advcalc1();
        obj1.show();
    }
}*/
