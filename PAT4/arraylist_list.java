package PAT4;
import java.util.ArrayList;

public class arraylist_list {
    public static void main(String a[]){
        //every element in List is Object type not primitive type so you have to use Integer
        ArrayList<Integer> arr  = new ArrayList<Integer>();
        ArrayList<Integer>arr1 = new ArrayList<Integer>();
        arr.add(20);
        arr.add(30);
        arr.add(50);

        //get(index)
        System.out.println(arr.get(2)); //50

        //Replaces the element at the specified position in this list with the specified element.
        arr.set(0,100);
        
        //Returns true if this list contains the specified element. 
        System.out.println(arr.contains(20)); //false

        //equals(Object o) Checks if two lists are equal list.equals(anotherList);
        arr.equals(arr1);

        //remove(int index) Removes the element at the specified position list.remove(2);
        //remove(Object o) Removes the first occurrence of the specified element list.remove("Banana"); //used in case of stricngs mostly
        arr.remove(2);

        //clear() Removes all elements from the list list.clear();
        arr.clear();

        //size() Returns the number of elements int n = list.size();
        System.out.println(arr.size()); //0

        //isEmpty() Returns true if the list has no elements list.isEmpty();
        System.out.println(arr.isEmpty()); //true

        //indexOf(Object o) Returns the first index of the element, or -1 if not found list.indexOf("Mango");
        arr.add(100);
        arr.add(200);
        arr.add(300);
        arr.add(100);
        System.out.println(arr.indexOf(100)); //0

        //lastIndexOf(Object o) Returns the last index of the element, or -1 if not found list.lastIndexOf("Mango");
        System.out.println(arr.lastIndexOf(100)); //3

        //toArray() Converts list to an Object array Object[] arr = list.toArray();
        Object arr2[] = arr.toArray();
        for(Object obj:arr2){ //100 200 300 100 
            System.out.printf("%d ",(Integer)obj); //type casting object to Integer. automatically unboxed to int
        }

        arr.add(0,10); //it wont replace it will add again
        for(int i:arr){
            System.out.printf("%d ",i); //10 100 200 300 100 
        }
    }
}
