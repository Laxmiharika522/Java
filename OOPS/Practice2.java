package OOPS;

class Computer{
    public void playMusic(){//curly braces should be given for methods
        System.out.println("Playing Music");
    }
    public String getmepen(int cost){
        if(cost>=10){
            return "pen";//when there is a return statement the code will jump out of the method
        }
        return "no pen";
    }
}
public class Practice2 {
    public static void main(String a[]){
        Computer obj=new Computer();
        obj.playMusic();
        String str=obj.getmepen(1);
        System.out.println(str);
    }
}
