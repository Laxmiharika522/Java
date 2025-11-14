package PACKAGES;
//import PACKAGES.* //imports all the files not all the folders
//import PACKAGES.tools.* //import all the files in tools folder
import PACKAGES.tools.Calc;
import PACKAGES.tools.Advcalc;

public class Demo {
    public static void main(String a[]){
        //Calc is tools package and tools package is in PACKAGES and Demo.java is in PACKAGES but not is tools so we need to importy tools
        Calc obj=new Calc();
        int r1=obj.add(5,6);

        Advcalc obj1=new Advcalc();
        int r2=obj1.multi(3,6);

        System.out.println(r1 + " : " + r2);
    }
}
