//Encapsulation
//private variables are accessed inside the same class
//we can access private data with the help of methods
package OOPS; 
class Human{
    private int age;
    private String name;
    public void setName(String n){//setter
        name=n;
    }
    public void setAge(int a){//setter
        age=a;
    }
    public String getName(){//getter
        return name;
    }
    public int getAge(){//getter
        return age;
    }
}
public class Practice5 {
    public static void main(String a[]){
        Human obj1=new Human();
        obj1.setAge(10);
        obj1.setName("Harika");
        System.out.println(obj1.getAge() + " : " + obj1.getName() ); // 10 : Harika
    }
}
