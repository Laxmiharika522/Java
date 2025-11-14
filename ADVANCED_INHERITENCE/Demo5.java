//Lambda Expression
//lambda function works for only functional interface
//In Java, a lambda function (or lambda expression) is a short block of code 
//Syntax : (parameters) -> { body }
//when we are writing lambda function it will increase the file size of Demo.class file but it will not create .class file for anonymous inner class(lambda expression)
package ADVANCED_INHERITENCE;

/*interface A{
    void show();
}
public class Demo5 {
    public static void main(String a[]){
        A obj1 = new A()
        {
            public void show(){
                System.out.println("in show");
            }
        };
        obj1.show(); //in show
    }
}*/

interface A{
    void show();
}
public class Demo5 {
    public static void main(String a[]){
        // A obj1 = ()->
        // {
        //     System.out.println("in show");
        // };
        //for single line
        A obj1 = () -> System.out.println("in show");
        obj1.show(); //in show
    }
}
