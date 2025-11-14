//if you want to extend inheritence for certain classes only
//if A is sealed class and permits B and C then B and C should be sealed or non-sealed or final
/*package JAVA17;
sealed class A permits B,C {//

}
final class B extends A{//final means no other class can extend this class

}
final class C extends A{

}
class D{

}
public class Sealed_classes {
    public static void main(String a[]){

    }
}*/


//error sealed class should compulsory permit other class
/*package JAVA17;
sealed class A permits B,C {//

}
//Sealed type B lacks a permits clause and no type from the same compilation unit declares B as its direct supertype
sealed class B extends A  {//error: sealed class should permit some other class

}
final class C extends A{

}
class D  {

}
public class Sealed_classes {
    public static void main(String a[]){

    }
}*/



//it works perfectly
/*package JAVA17;
sealed class A permits B,C {

}
sealed class B extends A permits D {

}
final class C extends A{

}
final class D extends B {

}
public class Sealed_classes {
    public static void main(String a[]){

    }
}*/

//unsealed class
/*package JAVA17;
sealed class A permits B,C {

}
non-sealed class B extends A {//for non-sealed permits is not compulsory

}
final class C extends A{

}
class D {

}
public class Sealed_classes {
    public static void main(String a[]){

    }
}*/

//sealed class A extends Thread implements Clonable permits B,C
//you can extend or implement anything in sealed class [permits should be last after extends and implements]

//The interface which is extending from sealed interface it should be either sealed or non-sealeed .we dont have option of final in case of interfaces

// sealed interface X permits Y{
// }
// sealed interface Y extends X{
// }

//or
// sealed interface X permits Y{
// }
// non-sealed interface Y extends X{
// }

