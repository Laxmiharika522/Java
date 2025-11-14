//throws Exception says that the object or method which calls the show() method will take take care of exception
package EXCEPTIONAL_HANDLING;

class A{
    public void show() throws ClassNotFoundException{
        Class.forName("Hello");//there is no Hello class so it throws an error
    }
}
public class Demo6 {
    public static void main(String a[]){
        A obj = new A();
        try{
            obj.show();
        }
        catch(Exception e){
            System.out.println("There is no class named Hello");
            //e.printStackTrace(); //You can track entire method calls
        }
    }
}


/*package EXCEPTIONAL_HANDLING;

class A{
    public void show() throws ClassNotFoundException{
        Class.forName("Hello");
    }
}
public class Demo6 {
    //try to avoid writing like this use try and catch block
    public static void main(String a[]) throws ClassNotFoundException{//Obj object is called in main method and main method is called by JVM so JVM should handle the Exception 
        A obj = new A();
        obj.show();

    }
}*/