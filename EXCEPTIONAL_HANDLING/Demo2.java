//if there is an Exception(error) in try block it will go to catch block,the other statements in the try block it will not execute
package EXCEPTIONAL_HANDLING;

public class Demo2 {
    public static void main(String a[]){
        int i=0;
        int j=0;
        try{
            j=10/i; //even there is an error catch block handles the error and executes other statements
            System.out.println("you passed without error"); //this line will not execute because of error
        }
        catch(Exception e){
            System.out.println("something went wrong " + e);
        }
        System.out.println(j); //j is still 0
        System.out.println("bye");

        //O/P:
        // something went wrong java.lang.ArithmeticException: / by zero
        // 0
        // bye
    }
}

//if there is no error try block executes all the statements
/*package EXCEPTIONAL_HANDLING;


public class Demo2 {
    public static void main(String a[]){
        int i=2;
        int j=0;
        try{
            j=10/i; //j is updated
            System.out.println("you passed without error"); //this line will execute because of no error
        }
        catch(Exception e){
            System.out.println("something went wrong " + e);
        }
        System.out.println(j); //5
        System.out.println("bye");

        //O/P:
        // you passed without error
        // 5
        // bye
    }
}*/
