//this keyword
//this is a keyword which referes to the current object which is calling that method
package OOPS; 
class Human1{
    private int age;
    private String name;
    public void setName(String name){//setter
        this.name=name;
    }
    public void setAge(int age){//setter
        this.age=age;
    }
    public String getName(){//getter
        return name;
    }
    public int getAge(){//getter
        return age;
    }
}
public class Practice6 {
    public static void main(String a[]){
        Human1 obj1=new Human1();
        obj1.setAge(10);
        obj1.setName("Harika");
        System.out.println(obj1.getAge() + " : " + obj1.getName()); // 10 : Harika
    }
}


//we can use like this also
//but instead of passing object as parameter and creating new object we can use this keyword
/*package OOPS; 
class Human1{
    private int age;
    private String name;
    public void setName(String name,Human1 obj){//setter
        Human1 obj1=obj; //here obj1 has reference of obj
        obj1.name=name;
    }
    public void setAge(int age,Human1 obj){//setter
        Human1 obj1=obj; //here obj1 has refernce of obj
        obj1.age=age;
    }
    public String getName(){//getter
        return name;
    }
    public int getAge(){//getter
        return age;
    }
}
public class practice6 {
    public static void main(String a[]){
        Human1 obj=new Human1();
        obj.setAge(10,obj);
        obj.setName("Harika",obj);
        System.out.println(obj.getAge() + " : " + obj.getName()); // 10 : Harika
    }
}*/

