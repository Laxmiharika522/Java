//try with resources
package EXCEPTIONAL_HANDLING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo8 {
    public static void main(String a[]) throws IOException{
        int num=0;
        BufferedReader bf=null;
        try{
            bf = new BufferedReader(new InputStreamReader(System.in)); //we can write in one line
            num = Integer.parseInt(bf.readLine()); 
            System.out.println(num);
        }
        finally{//to close resources we use finally block
            bf.close();
        }
       
    }
}


/*package EXCEPTIONAL_HANDLING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo8 {
    public static void main(String a[]) throws IOException{
        int num=0;
        //once try gets over bf resource gets closed automatically
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)))
        {
            num = Integer.parseInt(bf.readLine()); 
            System.out.println(num);
        }
    }
    //all able ended words are interfaces
    //BufferedReader extends Reader,Reader implements closable,if we go to closable it is autoclosable
    //If you have interface autoclosable that will close automatically with the help of try.You dont have to close manually
}*/