//try with multiple catch in java
//Exception is parent class of ArithmeticException, ArrayIndexOutOfBoundsException, and other exceptions
// package EXCEPTIONAL_HANDLING;
package EXCEPTIONAL_HANDLING;

public class Demo3 {
    public static void main(String a[]){
        int i=0;
        int j=0;
        int arr[]=new int[5];
        try{
            j=10/i; //if there is an error in this statement it will not execute next statements
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index is out of bounds");
        }
        catch(Exception e){
            System.out.println("something went wrong " + e);
        }
        System.out.println(j); 
        System.out.println("bye");

        //O/P:
        // cannot divide by zero
        // 0
        // bye
    }
}


/*package EXCEPTIONAL_HANDLING;

public class Demo3 {
    public static void main(String a[]){
        int i=2;
        int j=0;
        int arr[]=new int[5];
        try{
            j=10/i;//10/2 =5 so j is updated to 5 //there is no error it will go to next statement
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index is out of bounds");
        }
        catch(Exception e){
            System.out.println("something went wrong " + e);
        }
        System.out.println(j); //5
        System.out.println("bye");

        //O/P:
        // index is out of bounds
        // 5
        // bye
    }
}*/



/*package EXCEPTIONAL_HANDLING;

public class Demo3 {
    public static void main(String a[]){
        int i=2;
        int j=0;
        int arr[]=new int[5];
        String name=null;
        try{
            j=10/i; //10/2 =5 so j is updated to 5//there is no error it will go to next statement
            System.out.println(arr[4]); //no error go to next line
            System.out.println(name.length()); //it executes catch(Exception e)
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index is out of bounds");
        }
        catch(Exception e){
            System.out.println("something went wrong " + e);
        }
        System.out.println(j); 
        System.out.println("bye");

        //O/P:
        // 0 because arr[4]
        // something went wrong java.lang.NullPointerException: Cannot invoke "String.length()" because "<local4>" is null
        // 5
        // bye
    }
}*/


//catch(Exception e) should be written at the end of all catch blocks
/*package EXCEPTIONAL_HANDLING;

public class Demo3 {
    public static void main(String a[]){
        int i=2;
        int j=0;
        int arr[]=new int[5];
        String name=null;
        try{
            j=10/i; 
            System.out.println(arr[4]); 
            System.out.println(name.length()); 
        }
        //if you write parent Exception starting for every error it will execute parent catch block only .
        //then is no point of creating ArithmeticException and ArrayIndexOutOfBoundsException catch blocks so it gives an error
        //error: Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception 
        
        catch(Exception e){
            System.out.println("something went wrong " + e);
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index is out of bounds");
        }
        System.out.println(j); 
        System.out.println("bye");
    }
}*/
