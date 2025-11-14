//Strings are immutable 

//literals are fixed values 

//In Java, string literals like "Harika" are stored in a special memory area called the String Constant Pool.
//When you write String s1 = "Harika"; and then String s2 = "Harika";, both s1 and s2 refer to the same object in the string pool.
//The == operator compares references (i.e., whether both variables point to the same object), not the contents of the strings.
//Since both s1 and s2 point to the same memory location, s1 == s2 returns true.

class string2 {
    public static void main(String a[]){

        String name="harika";
        name = "Laxmi" +  name;
        System.out.println(name);

        //s1,s2 are refernce variables that means which points to the address or id
        //Harika is an object of type string with certain id
        String s1="Harika";
        String s2="Harika";
        System.out.println(s1==s2); //true

    }
}
