package ACCESS_MODIFIERS;
import ACCESS_MODIFIERS.tools.*;

public class C extends A {//C is a subclass of A
    public static void main(String a[]){
        C obj2=new C();
        //System.out.println(obj2.age); //age is private in A class so we cannot access outside the A class
        System.out.println(obj2.section);//it will work because section is protected 
        //System.out.println(obj2.marks); //marks is default so we can access inside the same package only
    }
}
