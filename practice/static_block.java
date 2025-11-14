//explaination
/*class Mobile2{
    String brand;
    int price;
    static String name;

    //if we create objects default constructor is invoked and all values are intialized for each and every object
    //name is static variable we need to intialize for each and every object so there we use static block
    public Mobile2(){//default constructor
        brand=" ";
        price=200;
        name="phone";
    }
    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}
public class static_block {
    public static void main(String a[]){
        Mobile2 obj1=new Mobile2();
        Mobile2 obj2=new Mobile2();
        obj1.show(); 
        obj2.show();
        
    }
}*/

//static block is used to intilize static variables only but not non-static variables or methods
class Mobile2{
    String brand;
    int price;
    static String name;

    //we can create multiple objects but static block is executed only once when the class is loaded
    static{
        name="phone";
        System.out.println("in static block");
    }
    public Mobile2(){
        brand=" ";
        price=200;
        System.out.println("constructor invoked");
    }
}
public class static_block {
    public static void main(String a[]){
        Mobile2 obj1=new Mobile2();
        Mobile2 obj2=new Mobile2();        
    }
}

///o/p:  in static block
       //constructor invoked
       //constructor invoked
