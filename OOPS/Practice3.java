package OOPS;

//Calculator already used in practice 1 file u cant use here if u change anything it will reflect in practce1
// class Calculator {
    //Not correct
    // public int add(int a,int b) {//method
    //     System.out.println("in add");
    //     return a-b;
    // }
    
// };
class Calculator2{//user defined class names should be unique in same packages
     public int add(int a,int b) {
        System.out.println("in add");
        return a-b;
    }
}
public class Practice3 {
    public static void main(String[] a) {
        int num1=4;
        int num2=5;
        Calculator2 cal=new Calculator2();//this is where we create objects Calculator has design(methods and properties)
        int result=cal.add(num1, num2); //once we got object by using cal object we can call add method
        System.out.println(result);
    }
}

