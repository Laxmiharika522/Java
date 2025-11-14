package JAVA17;
// class var{//'var' is not a valid type name var cannot be used as class name

// }
class Alien{

}
public class var_keyword {
    //var num=10; //var' is not allowed here because num is a instance variable
    public static void main(String a[]){
        int c=10;
        var b=12; //12 is auto-matically converted to integer
        System.out.println(c);
        System.out.println(b);

        //var d;//Cannot use 'var' on variable without initialize

        String var = "Harika";//var can be used as variable name but not class name
        System.out.println(var);//Harika

        int nums[] = new int[10];
        //var nums1[] = new int[10]; //'var' is not allowed as an element type of an array
        var nums1=new int[10];//it will work

        Alien object = new Alien();
        var obj =  new Alien(); //var works for objects also
    }
}
