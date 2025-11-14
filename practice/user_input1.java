//println() is a method of Printstream class. out is an object of Printstream class
//out is created as static object in System class
//so System.out.println()
//in is a object of Inputstream
//in is created as static object in System class

import java.io.IOException;

public class user_input1 {
    public static void main(String a[]) throws IOException{
        //int java.io.InputStream.read() throws IOException. we have handle this exception because it is checked exception .compiler forces to handle the exception
        int num=System.in.read();//Returns:the next byte of data.This method only reads one character.
        System.out.println(num); //Prints the ASCII value of the entered character
        System.out.println(num-48);//to get the number what we entered
    }
    //read() method cannot read double digit number .It can read only one charecter
}


//If you want bigger numbers we can use BufferedReader
//BufferedReader is a basically a class which works with io .io belongs to java.io package
//java.lang is auto import
/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class user_input1{
    public static void main(String a[]) throws IOException{
        ////in is a object of Inputstream.and it is static in System class
        //java.io.InputStreamReader.InputStreamReader(InputStream in) accepts parameter of in object from InputStream class
        InputStreamReader in = new InputStreamReader(System.in);
        //java.io.BufferedReader.BufferedReader(Reader in) accepts parameter of in object from Reader class
        BufferedReader bf = new BufferedReader(in);
        //readLine() also throw IOException
        int num=Integer.parseInt(bf.readLine()); //readLine() reads string .we can convert string (which contains integer value) into int integer type
        System.out.println(num);
        //bf is a resource(file) when you open file we need to close it
        bf.close(); //it will not give error but there is a leakage of data 
    }
}*/


/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class user_input1{
    public static void main(String a[]) throws IOException{
        //InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //we can write in one line
        int num=Integer.parseInt(bf.readLine()); 
        System.out.println(num);
        bf.close();
    }
}*/


/*import java.util.Scanner;
public class user_input1{
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(x);
        sc.close();
    }
}*/

