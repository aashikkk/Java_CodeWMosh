package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show(){
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c");

        Collection<String> other = new ArrayList<>(collection); // initialize with another collection, instead of other.add(collection);

        System.out.println(collection == other); // false, different references
        System.out.println(collection.equals(other)); // true, same content


//        Object[] objectArray = collection.toArray();
//        var stringArray = collection.toArray(new String[0]); // Ctrl + Q to see the documentation(type)
//        stringArray[0]. // Can access string methods


//        System.out.println(collection.contains("a"));
//        collection.remove("a");
//        collection.clear();
//        System.out.println(collection.isEmpty());
//        System.out.println(collection);

//        System.out.println(collection.size());
//        collection.add("a");
//        collection.add("b");
//        collection.add("c");
//
//        for (var item: collection)
//            System.out.println(item);

    }
}
