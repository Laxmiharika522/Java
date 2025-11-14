public class equals_method {
    public static void main(String a[]){
        //in string constant pool Harika has only one address
        //both name1 and name2 assigned to same address
        String name1="Harika"; //like this declaration is stored in string constant pool
        String name2="Harika";
        //for comparision we use equals
        //Returns:true if the given object represents a String equivalent to this string, false otherwise

        
        // equals() compares content (character by character)
        System.out.println(name1.equals(name2));  // true
        // == compares reference (memory address)
        System.out.println(name1==name2); // true, because both refer to the same object in the pool

        //name3 and name4 is stored in heap memory so name3 and name4 are different objects hence they have different address
        String name3=new String("Harika");
        String name4=new String("Harika");
        System.out.println(name3.equals(name4)); //true
        System.out.println(name3==name4);//false

    }
}
