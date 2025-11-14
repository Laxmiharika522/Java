//annotations

//Annotations in Java are metadata (information) added to your code to give instructions to the compiler or tools.

//They don’t affect program logic directly, but they help the compiler, frameworks (like Spring), or tools (like IDEs) understand your code better.

// @Override tells the compiler:
// "This method is intended to override a method from a superclass."

package INHERITENCE;
class N{
    public void showMyWorkInThisClass(){
        System.out.println("in show of N");
    }
}
class K extends N{
    // @Override
    // public void showMyWorInThisClass(){//shows an error spelling error
    //     System.out.println("in show of K");
    // }
    @Override
    public void showMyWorkInThisClass(){//rectify your error
        System.out.println("in show of K");
    }

}
public class Demo24 {
    public static void main(String a[]){
        N obj = new K();
        //obj.showMyWorkInThisClass(); //in show of N before rectification
        //it will not override because check the spelling these are called logical errors we can find logical errors by using annotations

        obj.showMyWorkInThisClass(); //after rectification
        //in show of K
    }
}
