//we get methods from Enum class
package ADVANCED_INHERITENCE;

enum Laptop{//here enum(type) is used instead of class
    Macbook(2000),Xps(2200),Surface,Thinkpad;
    private int price;
    private Laptop(){//default constructor
        this.price=500;//default price
    }
    private Laptop(int price){
        this.price=price;
        System.out.println("in Laptop :" + this.name());
    }
    public int getprice(){
        return this.price;
    }
}
public class Demo3 {
    public static void main(String a[]){
        // Laptop obj1=Laptop.Macbook;
        // System.out.println(obj1 + " : " + obj1.getprice());
        for(Laptop obj1: Laptop.values()){//constructors called
            System.out.println(obj1 + " : " + obj1.getprice());
        }
    }
    //O/p:
    // in Laptop :Macbook
    // in Laptop :Xps
    // Macbook : 2000
    // Xps : 2200
    // Surface : 500
    // Thinkpad : 500

}
