package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show(){
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c");
        System.out.println(list);

//        System.out.println(list.subList(0,2)); // get a sublist of the list, returns new list [a, b]
//        System.out.println(list.lastIndexOf("a")); // get the last index of the element
//        System.out.println(list.indexOf("b")); // get the index of the element
//        list.remove(0); // remove the first element
//        list.set(0, "a+"); // updating the first element
//        System.out.println(list.get(0)); // getting the first element
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add(0, "!");
    }
}
