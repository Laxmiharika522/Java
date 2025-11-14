//interface
package INHERITENCE;

interface Computer1{
    void code();
}
class Laptop1 implements Computer1{
    public void code(){
        System.out.println("code,compile,run");
    }
}
class Desktop1 implements Computer1{
    public void code(){
        System.out.println("code,compile,run : Faster");
    }
}
class Developer1{
    public void develop(Computer1 obj){//whatever you give either desktop object or laptop object Developer should write the code
        obj.code();
    }
}
public class Demo21 {
    public static void main(String a[]){
        Computer1 lap = new Laptop1();
        Computer1 desk = new Desktop1();
        Developer1 obj = new Developer1();
        obj.develop(lap); //we are giving laptop to user
        // O/P : code,compile,run
        obj.develop(desk); //we are desktop to the user
        // O/P : code,compile,run : Faster
    }
}

