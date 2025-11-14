//lambda expression with return 
package ADVANCED_INHERITENCE;

interface X{
    int sum1(int i,int j);
}
public class Demo7 {
    public static void main(String a[])
    //anonymous inner class
    {
        // X obj = new X(){
        //     public int  sum1(int i,int j){
        //         return i+j;
        //     }
        // };
        //System.out.println(obj.sum1(2,3));5


        //X obj = (int i, int j) -> return i+j; // no need to write return statement it is an error : Syntax error on token "return", delete this toke
        //X obj = (int i, int j) ->  i+j; //this is correct

        //simplified
        X obj = (i,j) -> i+j;
        System.out.println(obj.sum1(2,3)); //5
    }
}
