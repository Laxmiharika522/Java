//Wrappers
// when a primitive data type is stored in a wrapper object, this process is called autoboxing in Java.
//Auto-unboxing is the process where Java automatically converts a wrapper class object (like Integer, Double, etc.) into its corresponding primitive type (int, double, etc.).
package INHERITENCE;

public class Demo11 {
    public static void main(String a[]){
        int num=7;
        //Integer num1=new Integer(num); //we use this way also but it is depricated
        //Auto-boxing
        Integer num1=num;//we are storing primitive data type in wrapper object(num1 is an object ).
        System.out.println(num1); //7

        //Auto-unboxing
        int num2=num1.intValue();//intValue() is a method. we can call methods by using objects
        //int num2=num1;//we can use this way also
        System.out.println(num2); //7

        String str="12";
        //parameters: a String containing the int representation to be parsed
        //Returns: the integer value represented by the argument in decimal.
        int num3=Integer.parseInt(str);
         System.out.println(num3);//12

    }
}
