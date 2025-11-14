package PAT4;
import java.util.LinkedList;
public class linkedlist_list {
    public static void main(String a[]){
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("hello");
        ll.add("world");
        ll.add("geeks");

        ll.add(1,"hello"); //adding another hello
        ll.set(2, "For");//replace

        ll.remove(1);
        ll.remove("geeks");

        for(int i=0;i<ll.size();i++){
            System.out.printf(ll.get(i)+" "); //hello For
        }

        //for each loop
        for(String name: ll){
            System.out.printf(name + " "); //hello For
        }

        //clear()	This method removes all of the elements from this list.
        //get(int index)	This method returns the element at the specified position in this list.
        // getFirst()	This method returns the first element in this list.
        // getLast()	This method returns the last element in this list.
        // indexOf(Object o)	Return first index of element or -1 if element is not present
        // lastIndexOf(Object o)	Return Last index of element or -1 if element is not present

        //peek() is for head element and peekFirst() is for first element basically both are same only

        //peek()	This method retrieves but does not remove, the head (first element) of this list.
        System.out.println(ll.peek()); //hello

        //peekFirst()	This method retrieves, but does not remove, the first element of this list or returns null if this list is empty.
        System.out.println(ll.peekFirst()); //hello

        //poll()	This method retrieves and removes the head (first element) of this list.
        //pollFirst()	This method retrieves and removes the first element of this list or returns null if this list is empty.

    }
}
