class Mobile1{
    String brand;
    int price;
    static String name;
    //we can access non-static variables inside static method by passing objects as parameters
    public static void show(Mobile1 obj){//this object refers to obj1
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}
public class static_method {
    public static void main(String a[]){
        Mobile1 obj1=new Mobile1();
        obj1.brand="apple";
        obj1.price=1700;
        // static variables should be called by their class name
        Mobile1.name="smartphone";

        Mobile1 obj2=new Mobile1();
        obj2.brand="iphone";
        obj2.price=1500;

        //static method can be accessed by class name
        Mobile1.show(obj1); // O/P: apple : 1700 : smartphone
        
    }
}

//errors

/*class Mobile1{
    String brand;
    int price;
    static String name;
    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}
public class static_method {
    public static void main(String a[]){
        Mobile1 obj1=new Mobile1();
        obj1.brand="apple";
        obj1.price=1700;
        // static variables should be called by their class name
        Mobile1.name="smartphone";

        Mobile1 obj2=new Mobile1();
        obj2.brand="iphone";
        obj2.price=1500;

        //cannot make a static reference to the non-static method show() from the type Mobile1
        Mobile1.show();//error
        
    }
}*/

/*class Mobile1{
    String brand;
    int price;
    static String name;
    //static method cannot access non static variables
    public static void show(){//error
        System.out.println(brand + " : " + price + " : " + name); //brand and price are non static variables 
    }
}
public class static_method {
    public static void main(String a[]){
        Mobile1 obj1=new Mobile1();
        obj1.brand="apple";
        obj1.price=1700;
        // static variables should be called by their class name
        Mobile1.name="smartphone";

        Mobile1 obj2=new Mobile1();
        obj2.brand="iphone";
        obj2.price=1500;

        Mobile1.show();
        
    }
}*/
