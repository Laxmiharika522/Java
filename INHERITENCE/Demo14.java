//Inner class
//in output C1$C2.class is created for C2 class. which means C2 belongs to C1 class
//C1.C2 means C2 belongs to C1 class
package INHERITENCE;

class C1{
    public void show(){
        System.out.println("in show");
    }
    class C2{
        public void config(){
            System.out.println("in config");
        }
    }
}
public class Demo14 {
    public static void main(String a[]){
        C1 obj=new C1();
        obj.show();//in show

        C1.C2 obj2 = obj.new C2();//for creating objects of inner class we need object of outerclass
        obj2.config(); //in config
    }
}
