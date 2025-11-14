//if you want to add even numbers after doubling it
package COLLECTIONS;

import java.util.Arrays;
import java.util.List;

public class Demo9 {
    public static void main(String a[]){
        List<Integer> nums = Arrays.asList(2,5,7,6,4);
        int sum=0;
        for(int n:nums){
            if(n%2==0){
                n=n*2;
                sum+=n;
            }
        }
        System.out.println(sum); //24
    }
}
