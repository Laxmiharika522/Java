//single inheritence in different files
package INHERITENCE;

public class Demo {
    public static void main(String a[]){
        Advcalc obj1=new Advcalc();
        int x=obj1.add(2,3);
        int y=obj1.sub(5,6);
        int z=obj1.multi(3,4);
        int k=obj1.div(8,4);
        System.out.println(x + " : " + y + " : " + z + " : " + k);  //5 : 11 : 12 : 2
    }
}
