//Static inner class
//we can make static inner class but we cannot make static outer class
package INHERITENCE;

class D1{
    public void show(){
        System.out.println("in show");
    }
    static class D2{
        public void config(){
            System.out.println("in config");
        }
    }
}
public class Demo15 {
    public static void main(String a[]){
        D1 obj=new D1();
        obj.show();//in show

        //inner static object is called by outer class not outer class object
        D1.D2 obj2 = new D1.D2();//if inner class is static we need not to call outer object while creating inner object.we need to use outerclass name
        obj2.config(); //in config
    }
}
