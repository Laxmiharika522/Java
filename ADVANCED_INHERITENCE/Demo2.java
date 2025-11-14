package ADVANCED_INHERITENCE;

enum Status2{
    Running,Failed,Pending,Success;
}
public class Demo2 {
    public static void main(String a[]){
        Status2 obj1=Status2.Pending;
        switch(obj1){
            case Running: //Running is of type obj1
            System.out.println("running in the ground");
            break;
            case Failed:
            System.out.println("Failed the test case");
            break;
            case Pending:
            System.out.println("in pending");
            break;
            case Success:
            System.out.println("passed");
            break;
        }
    }
    //O/P :in pending
}

