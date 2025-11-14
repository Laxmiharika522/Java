//enum
//enum is of data type
//Status is a class
//Running,Failed.... are objects and constants(of type enum)
//ordinal and values are the methods of Enum class
// Each constant is public static final — like:
// public static final Day MONDAY = new Day()
//The enum implicitly extends the java.lang.Enum class.

package ADVANCED_INHERITENCE;

enum Status{
    Running,Failed,Pending,Success;
}
public class Demo {
    public static void main(String a[]){
        Status obj1=Status.Running;
        System.out.println(obj1); //Running

        //Status obj2 = Status.Noidea; //Noidea cannot be resolved or is not a field

        //name() method returns : the name of this enum constant
        Status obj2=Status.Running;
        System.out.println(obj2.name()); //Running

        //we can get index by ordinal
        Status obj3=Status.Running;
        System.out.println(obj3.ordinal()); //0

        //we can store array of constants
        Status obj4[]=Status.values();
        System.out.println(obj4[2]); //Pending

        //printing all objects or constants at a time
        for(Status ss: obj4){
            System.out.println(ss + " : " + ss.ordinal());
        }
        //O/p: 
        //Running : 0
        //Failed : 1
        //Pending : 2
        //Success : 3
    }
}
