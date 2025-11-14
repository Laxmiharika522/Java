//super() method
package INHERITENCE;

class A{
    public A(){
        //super() by default it is automatically created
        System.out.println("In A");
    }
}
class B extends A{
    public B(){
        //super() by default it will be automaticallly created
        System.out.println("In B");
    }
}
public class Demo3 {
    public static void main(String a[]){
        B obj1 = new B(); //object is created so default constructor is called
    }
}

//O/P:  In A
      //In B
//explaination: every constructor has super() method. when u create an object super method will be called internally
// super() means calls the constructor of super clase(base class)


//2) user defined super() method
/*package INHERITENCE;

class A extends Object{ //by default extends Object will be there but it is invisible
    public A(){
        super();//by default it will be there but it is invisible
        System.out.println("In A");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("In B");
    }
}
public class Demo3 {
    public static void main(String a[]){
        B obj1 = new B(); //object is created so default constructor is called
        //when we create object of B it goes to  line 37 after that it goes to line 38 super method calls the constructor of parent class so it goes to line 32 there is another super class which calls the constructor of parent parent class. Here we use object class 
        //object class is a in-built class. parent class by default extends from object class
        //but class B does not extend from Object class it only extends from class A
    }
}*/

//3) parameterized constructor
/*package INHERITENCE;

class A extends Object{ //by default extends Object will be there but it is invisible
    public A(){
        super();//by default it will be there but it is invisible
        System.out.println("In A");
    }
    public A(int x){
        //super();
        System.out.println("In parameterised constructor of base class");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("In B");
    }
    public B(int k){
        //super(); //by default will be there in every constructor
        System.out.println("In parameterised constructor of derived class");
    }
}
public class Demo3 {
    public static void main(String a[]){
        B obj1 = new B(5); //calling parameterised constructor
    }
}*/
//O/P: //In A
      //In parameterised constructor of derived class
//explaination: when we call parameterised constructor  it goes to line 69 next it goes to line 70 super constructor is invoked so parent class default constructor(non-parameterised) is called. 
//Next it goes line 71 ;

//4) calling parameterised constructor of parent class
/*package INHERITENCE;

class A extends Object{ //by default extends Object will be there but it is invisible
    public A(){
        super();//by default it will be there but it is invisible
        System.out.println("In A");
    }
    public A(int x){
        super(); //by default it will be there but it is invisible
        System.out.println("In parameterised constructor of base class");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("In B");
    }
    public B(int k){
        super(k); //here we are passing parameter inside the super method so it will call parameterised constructor of parent class  
        System.out.println("In parameterised constructor of derived class");
    }
}
public class Demo3 {
    public static void main(String a[]){
        B obj1 = new B(5); //calling parameterised constructor
    }
}*/

//o/p: In parameterised constructor of base class
     //In parameterised constructor of derived class
