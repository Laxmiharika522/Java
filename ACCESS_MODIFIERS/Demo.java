//A and B are in same package
//C is a subclass of A in another package
//Demo is in another package
package ACCESS_MODIFIERS;

import ACCESS_MODIFIERS.tools.*; //all files in tools are imported

public class Demo {
    public static void main(String a[]){
        B obj1=new B();
        System.out.println(obj1.name); //name is public in B class we can access outside the tools package
        A obj2=new A();
        //System.out.println(obj2.age); //age is private in A class so we cannot access outside the A class
        //System.out.println(obj2.section);//section is protected it will work in same package and sub-class of other package
        //System.out.println(obj2.marks); //marks is default so it will inside the same package only

    }
}
