//Anonymous(without name) inner class in case of overridding
//Demo16$1.class is created in output .since we dont know the name it is taking as 1,2,3...
//we can create anonymous class for multiple method implementation or overriding
package INHERITENCE;

class Animal{
    public void show(){
        System.out.println("in animal show");
    }
    public void show1(){
        System.out.println("in animal show1");
    }

}
//to just override the method no need to create class we can use anonymous inner class
// class Monkey extends Animal{
//     public void show(){
//         System.out.println("in Monkey show");
//     }
// }
public class Demo16 {
    public static void main(String a[]){
        Animal obj=new Animal()
        //this block is called anonymous class (without name)
        {
            public void show(){
                System.out.println("in Monkey show");
            }
            public void show1(){
                System.out.println("in Monkey show1");
            }   
        };
        
        obj.show();//in Monkey show
        obj.show1();//in Monkey show1
    }
}
