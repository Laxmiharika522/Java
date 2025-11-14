//try and catch block : hey java try to execute this code if it works that's fine otherwise execute other part dont stop the execution
package EXCEPTIONAL_HANDLING;

public class Demo1 {
    public static void main(String a[]){
        int i=0;
        int j=0;
        try{
            j=10/i; //even there is an error catch block handles the error and executes other statements
        }
        catch(Exception e){//catch takes object as parameter(e is an object)
            System.out.println("something went wrong " + e); //e is to print name of exception
        }
        System.out.println(j); //j is still 0
        System.out.println("bye");

        //O/P:
        // something went wrong java.lang.ArithmeticException: / by zero
        // 0
        // bye
    }
}
