//string buffer is mutable 
class stringbuffer {
    public static void main(String a[]){
        StringBuffer sb=new StringBuffer("Laxmi");
        System.out.println(sb.capacity()); //16+5=21

        System.out.println(sb.length());//5

        sb.append(" harika");
        System.out.println(sb);//Laxmi harika

        sb.insert(0, "java "); //at index 0 insert java
        System.out.println(sb);//java Laxmi harika

       sb.setLength(30);//maximum length is 30 if length is less than 30 the other charecters are Null
       System.out.println(sb); //java Laxmi harika.............remaining length is null

       sb.ensureCapacity(10);//minimum capacity
       System.out.println(sb);

       sb.deleteCharAt(2);
       System.out.println(sb);//jaa Laxmi harika

       //converting string buffer to string
       String str=sb.toString();
       System.out.println(str);
    }
    
}
