//parameterized lambda expression
package ADVANCED_INHERITENCE;

interface B{
    void show(int i);
}
interface C{
    void show(int i,int j);
}
public class Demo6 {
    public static void main(String a[]){
        B obj =(int i) -> System.out.println("in show "+ i);
        obj.show(5);// in show 5
        //multiple parameters
        C obj1 = (int i,int j) -> {//multiple statements use curly braces
            System.out.println("in show " + i + j);
            System.out.println(i+j); //12
        };
        //i + j is treated as string concatenation because before i+j there is a string so all three undergoes string concatination
        obj1.show(2,10); //in show 210 //12

    }
}
