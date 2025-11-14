//Exception throw keyword
//if there is no error then catch block will not be executed but you want to exceute catch blco so you throw
//throw throws an object to catch blcok.since catch block needs object it will take object and exceute catch block
package EXCEPTIONAL_HANDLING;

public class Demo4 {
    public static void main(String a[]){
        int i=20;
        int j=0;
        try{
            j=10/i; //no error j is updated to 5
            if(j==0){
                throw new ArithmeticException(); //new ArithmeticException is an object
            }
        }
        catch(ArithmeticException e){
            j=10/1; //now output will not be zero it is changed to 10
            System.out.println("that is the default output  " + e); 
        }
        System.out.println(j); 
        System.out.println("bye");
    }
    //O/P:
    // that is the default output java.lang.ArithmeticException
    // 10
    // bye
}


//to print our own error message pass error message as parameter inside the object
/*public class Demo4 {
    public static void main(String a[]){
        int i=20;
        int j=0;
        try{
            j=10/i; //j=0 now 
            if(j==0){
                throw new ArithmeticException("I dont want my output as zero"); //new ArithmeticException is an object
            }
        }
        catch(ArithmeticException e){
            j=10/1; //now output will not be zero it is changed to 18
            System.out.println("that is the default output  " + e); 
        }
        System.out.println(j); 
        System.out.println("bye");
    }
    //O/P:In online gdb
    //that is the default output java.lang.ArithmeticException: I dont want my output as zero
    //10
    //bye

}*/
