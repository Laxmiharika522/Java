//Single inheritence in one file
//writing all classes in single file only Demo class is public and Demo class has main method
package INHERITENCE;

class Calc1 {
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int sub(int n1,int n2){
        return n1+n2;
    }
}

class Advcalc1 extends Calc1 {
    public int multi(int n1,int n2){
        return n1*n2;
    }
    public int div(int n1,int n2){
        return n1/n2;
    }
}

public class Demo1 {
    public static void main(String a[]){
        Advcalc1 obj1=new Advcalc1();
        int x=obj1.add(6,3);
        int y=obj1.sub(9,6);
        int z=obj1.multi(0,4);
        int k=obj1.div(4,4);
        System.out.println(x + " : " + y + " : " + z + " : " + k);  //9 : 15 : 0 : 1
    }
}
