//#23
//when u r daling with class and objects you need to import packages other then no need
package OOPS;

class Calculator {
    public int add(int a,int b) {//method
        System.out.println("in add");
        return a+b;
    }
}
public class Practice1 {
    public static void main(String[] a) {
        int num1=4;
        int num2=5;
        Calculator cal=new Calculator();//this is where we create objects Calculator has design(methods and properties)
        int result=cal.add(num1, num2); //once we got object by using cal object we can call add method
        System.out.println(result);
    }
}
