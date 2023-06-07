import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {

        /**Compared to arrayLists
        They both are part of the Java Collection Framework and they both implement the "LIST INTERFACE"*/
        LinkedList<String> carsLinkedList = new LinkedList<>();
        ArrayList<String> carsArrayList = new ArrayList<>();

        //Adding elements
        carsLinkedList.add("Audi");
        carsArrayList.add("Nissan");

        /**
         ArrayLists aint got a fixed size cuz when u wanna add a new element fe, it creates a new array of a bigger size by 1,
         and add that new element the thing which we will have to do manually if we used a simple array!

         While on the other hand, the linkedList has a head, nodes and a tail at the end, in a way that the head "First node"
         refers the next node "Next element", and the next node refers to the next "And the prev in the doubly linked list",
         and so on till we reach the tail

         Thus, lets say we have a list of a 1000 cars, and we wanna get car number 455 in the list ->

         -> for ArrayList :
                The time needed to get the car number 1, number 203, number 400 or even number 1000 or any other car is the same!

         -> While for the linkedList :
                To get the carr number 400, it needs to pass all the cars starting from the head till it reaches the car 400

         Which makes it way too slower for the linked list, as more memory is used and way less efficiency the work is done by!

         #Where the LinkedLists kicks the arrayLists ass at, is the adding & removing elements ->

         -> ArrayLists :
                To add and remove elements, it creates a whole new array, copying the values of the old one,
                and then inserting the new value at the given index

         -> On the other hand for the linkedList :
                To add an element lets say at the index of 4, it just makes the previous node refer to the new value,
                and the node after it to refer to the new value as the previous, and thats pretty much it!

         */

    }

}
