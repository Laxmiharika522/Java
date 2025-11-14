//method overloading
package OOPS;//u are importing packages so all classes will be imported becareful use different class names

class Calculator3 {
    //same method name but different parameters and type of parameters
    //return type doesnot matter what matters is type of parameters
    // public double add(int a,int b){//gives error parameters with integer type exists
    //      System.out.println("in add of two numbers");
    //     return a+b;
    // }
    public int add(int a,int b) {//method
        System.out.println("in add of two numbers");
        return a+b;
    }
    public int add(int a,int b,int c) {//method
        System.out.println("in add of threee numbers");
        return a+b+c;
    }
    public double add(double a,int b) {//method
        System.out.println("in add of two numbers");
        return a+b;
    }
}
public class Practice4 {
    public static void main(String[] a) {
        int num1=4;
        int num2=5;
        int num3=4;
        double num4=6;
        Calculator3 cal=new Calculator3();
        int result1=cal.add(num1, num2);
        System.out.println(result1);
        int result2=cal.add(num1, num2,num3); 
        System.out.println(result2);
        double result3=cal.add(num4,num2);
        System.out.println(result3);
    }
}