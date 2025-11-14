class formatting {
    public static void main(String a[]){
        System.out.print("hi"); //no extra line
        System.out.println("hello world");//gives extra line

        int b=10;
        float c=12.345f;
        System.out.printf("The value of b is %d and c is %f",b,c); //formating
        System.out.println();//to get extra line
        System.out.format("The value of b is %d and c is %.2f",b,c); //formatting( o/p: The value of b is 10 and c is 12.35) 12.35 it is rounded off
        


    }
}
