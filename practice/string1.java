class string1 {
    public static void main(String a[]){
        //String is a class. For accessing the properties of class we need to create an object

        //both syntaxes are correct
        String name=new String("harika");//passing harika as parameter
        String name1="harika";//automatically it will create an object

        System.out.println(name);
        System.out.println(name1);

        //accessing methods in string class

        System.out.println(name.charAt(1));//gives the charecter at index 1
        System.out.println(name1.concat("santhu"));

        //'+' sign is used for string concatination

        System.out.println("hello " + name);        
    }
}
