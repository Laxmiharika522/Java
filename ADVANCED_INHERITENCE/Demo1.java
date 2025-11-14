//enum in if and else
package ADVANCED_INHERITENCE;

enum Status1{
    Running,Failed,Pending,Success;
}
public class Demo1 {
    public static void main(String a[]){
        Status1 obj1=Status1.Running;
        //For comparision we use same data type
        if(obj1==Status1.Running){ //obj1 is of type Status1 so Status1.Running returns Running which is of type Status1.
            System.out.println("running in the ground");
        }else if(obj1==Status1.Failed){
            System.out.println("Failed the test case");
        }else if(obj1==Status1.Pending){
            System.out.println("in pending");
        }else{
            System.out.println("passed");
        }
    }
    //O/P: running in the ground
}
