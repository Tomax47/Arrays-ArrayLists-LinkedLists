import java.util.ArrayList;
import java.util.Arrays;

public class Arrays_ArraysLists {

    public static void main(String[] args) {

        //Arrays have fixed size, and it needs to be given when declaring an array, as it can't be increased/shrank later o
        String[] names = new String[4];
        String[] names2 = {"Alex","Mickey","Jonny","Michel"};

        // <> : this is called a diamond operator
        //The arrayList's size aint fixed,which means it can be increased/shrank later on, plus we aint need to give it a size when declaring it
        ArrayList<String> namesList = new ArrayList<>();

        //Given values when declaring
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Lukas","John","Marcus","Mike"));

        //ArrayLists can hold only object, and not primitives (int, boolean etc..) ,though it supports wrapper types of primitives!

        //Some operations on arrays & arrayLists
        System.out.println(names2[1]);
        System.out.println(nameList.get(1));

        System.out.println(names2.length);
        System.out.println(nameList.size());

        //Aint work for arrays
        nameList.add("Hulk");
        nameList.remove(0);
        nameList.remove("Hulk");


        //Setting a new value for an element
        names2[1] = "Halo";
        System.out.println(names2[1]);

        nameList.set(1,"Jason");
        System.out.println(nameList.get(1));

        //Printing part
        //Printing an array as the following gives us the MEMORY ADDRESS OF THE ARRAY, therefor to print an array we gotta use the Arrays.toString() method
        System.out.println("Memory address of the array of names : "+names2);
        System.out.println("Array list of names : "+nameList);

    }
}
