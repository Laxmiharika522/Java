//Multilevel inheritence in single file
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

class Veryadvcalc extends Advcalc1{
    public double power(int n1,int n2){
        return Math.pow(n1,n2); //power function always returns double value
    }
}

public class Demo2 {
    public static void main(String a[]){
        Veryadvcalc obj1=new Veryadvcalc();
        int r1=obj1.add(6,3);
        int r2=obj1.sub(9,6);
        int r3=obj1.multi(0,4);
        int r4=obj1.div(4,4);
        double r5=obj1.power(2,4);
        System.out.println(r1 + " : " + r2 + " : " + r3 + " : " + r4 + " : " + r5);  //9 : 15 : 0 : 1 : 16.0
    }
}

