package generics;

public class Utils {
    public static <T extends Comparable<T>> T max(T first, T second){
        return first.compareTo(second) < 0 ? second : first;
    }

 public static void printUser(User user){
     System.out.println(user);
 }


 // class CAP#1 extends User{}
 // class Instructor extends User{}
 public static void printUsers(GenericList<? extends User> users){
        User x = users.get(0);

 }
}

/*
*   // class CAP#1 extends User{}
    // class Instructor extends User{}
    public static void printUsers(GenericList<? extends User> users){
        User x = users.get(0); // can only read from the list
        users.add(); // Error
        * We can't add to the list, bcz, it is not sure, what type of list it is.
        * For that we can use super keyword.
        *
        * When we add super keyword, it will be able to add to the list. But, we can't read from the list. but you can store it in Object but not User.
        * (GenericList<? super User> users)
        * users will be act like temp.
        * GenericList<Object> temp = new GenericList<>();
        *
        * If you want to read from list, then use extends keyword.
        * If you want to write to the list, then use super keyword.
 }
*
* */