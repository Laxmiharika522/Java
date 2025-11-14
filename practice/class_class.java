class Mobile3{
    String brand;
    int price;
    static String name;

    static{
        name="phone";
        System.out.println("in static block");
    }
    
    public Mobile3(){
        brand=" ";
        price=200;
        name="phone";
    }
    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}
public class class_class {
    public static void main(String a[]) throws Exception {

        //without creating objects we can load the class
        
        Class.forName("Mobile3"); //static block is executed because we are loading the class
    }
}
