//The variable name is static, meaning it's shared among all instances of the Mobile class.

// obj1.name = "smartphone";
// → name becomes "smartphone" (shared variable updated)

// obj2.name = "smartphone";
// → Still "smartphone"

// obj1.name = "phone";
// → name is changed to "phone" (again, shared, so change affects everyone)

/*class Mobile{
    String brand;
    int price;
    static String name;
    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}
public class static_variable {
    public static void main(String a[]){
        Mobile obj1=new Mobile();
        obj1.brand="apple";
        obj1.price=1700;
        obj1.name="smartphone";

        Mobile obj2=new Mobile();
        obj2.brand="iphone";
        obj2.price=1500;
        obj2.name="smartphone";

        obj1.name="phone"; //here we are changing in obj1 but it will reflect in obj2 also.

        obj1.show();
        obj2.show();
    }
}*/

class Mobile{
    String brand;
    int price;
    static String name;
    public void show(){
        //In non-static method we can use static variables
        System.out.println(brand + " : " + price + " : " + name);
    }
}
public class static_variable {
    public static void main(String a[]){
        Mobile obj1=new Mobile();
        obj1.brand="apple";
        obj1.price=1700;
        // static variables should be called by their class name
        Mobile.name="smartphone";

        Mobile obj2=new Mobile();
        obj2.brand="iphone";
        obj2.price=1500;
        //we are saving memory also not every object has own copy for it(name)
        //Mobile.name="smartphone"; //automatically name is smartphone only because static varible is shared by all instances of the class

        obj1.show();
        obj2.show();
    }
}
