//Custom Exception
package EXCEPTIONAL_HANDLING;

class CustomException extends Exception{
    public CustomException(String str){
        super(str); //Exception class also having constructor which requires sring as parameter . so we using super() to pass str as parameter in Exception constructor
    }
}
public class Demo5 {
    public static void main(String a[]){
        int i=20;
        int j=0;
        try{
            j=10/i; //j=0 now
            if(j==0){
                throw new CustomException("I dont want my output as zero"); //new CustomException is an object
            }
        }
        catch(CustomException e){
            j=10/1; //now output will not be zero it is changed to 18
            System.out.println("that is the default output  " + e); 
        }
        System.out.println(j); 
        System.out.println("bye");
    }

    //O/P:that is the default output  EXCEPTIONAL_HANDLING.CustomException: I dont want my output as zero
    //10
    //bye

}

