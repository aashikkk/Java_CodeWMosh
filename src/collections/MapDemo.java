package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void show(){
        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");
        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

//        map.replace("e1", new Customer("a++", "e1"));
//        var unknown = new Customer("Unknown", "");
//        var exists = map.containsKey("e10");
//        var customer = map.getOrDefault("e10", unknown);
//        var customer = map.get("e1"); // a1 - 0(1)
//        System.out.println(map);

        // Key
        for (var key: map.keySet())
            System.out.println(key);

        // Key and value
        for (var entry :map.entrySet())
            System.out.println(entry);      // entry.getKey() - for only key , entry.getValue() -for only value

        // Values but order is not guaranteed
        for (var customer: map.values())
            System.out.println(customer); // cannot assure the order

        // Map is not iterable
        // Java: Maps
        // C#: Dictionary
        // Python: Dictionary
        // JavaScript: Objects
        // var person = {name: "Mosh"}; // basically its a hash table

//        List<Customer> customers = new ArrayList<>();

//        // TO find an email of customer - O(n)
//        for (var customer: customers)
//            if (customer.getEmail() == "e1")
//                System.out.println("Found");
//        To the rescue HashTables there
    }
}
