//Object class,toString(),hashcode(),equals()
//every class extends from Object class
package INHERITENCE;

class Laptop{//by default it is class Laptop extends Object{
    String model;
    int price;
    public String toString(){//overrides the Object class
        return this.model + " : " + this.price;
    }
}
public class Demo9 {
    public static void main(String a[]){
        Laptop obj1=new Laptop();
        obj1.model="Lenovo yoga";
        obj1.price=50000;
        System.out.println(obj1);// INHERITENCE.Laptop@4617c264 before overriding
        //by defult internally we are calling toString() method
        //tostring is not method of Laptop but tostring is method of object class
        //System.out.println(obj1.toString());
        //to.string() is a method: Returns: a string representation of the object.
        //getClass().getName() + '@' + Integer.toHexString(hashCode())
        //hashCode() is also method in object class return respective integer value of object ----->instance method
        //Integer.toHexString() returns hexadecimal value of an integer-------> static method
        //we can create our own toString() method
        System.out.println(obj1.toString()); //Lenovo yoga : 50000
        System.out.println(obj1); //Lenovo yoga : 50000 //bydefault obj1 automatically calls toString() method
    }
}

// 🔹 equals() in String class compares content.
// 🔹 equals() in Object class compares address.
/*package INHERITENCE;

class Laptop{//by default it is class Laptop extends Object{
    String model;
    int price;
    public String toString(){//overrides the Object class
        return this.model + " : " + this.price;
    }
    public boolean equals(Laptop obj3){//overrides Object class
        if(this.model.equals(obj3.model) && this.price==obj3.price){
            return true;
        }else{
            return false;
        }
    }
}
public class Demo9 {
    public static void main(String a[]){
        Laptop obj1=new Laptop();
        obj1.model="Lenovo yoga";
        obj1.price=50000;

        Laptop obj2=new Laptop();
        obj2.model="Lenovo yoga";
        obj2.price=50000;

        System.out.println(obj1.equals(obj2)); //false before overriding
        //equals() in Object class compares address.
        //we can make equals() for comparing content
        
        System.out.println(obj1.equals(obj2)); //true after overriding
    }
}*/
