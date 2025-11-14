//try and finally
//catch is optinal but finally is compulsory
//finally block will execute irrespective of if you got exception or not
package EXCEPTIONAL_HANDLING;

public class Demo7 {
    public static void main(String a[]){
        int i=2;
        int j=0;
        try{
            j=10/i;
        }
        //if you dont mention finally it is error. Error: Syntax error, insert "Finally" to complete TryStatement
        catch(Exception e){
            System.out.println("something went wrong " + e); 
        }
        finally{
            System.out.println("BYE");
        }
    }
}
