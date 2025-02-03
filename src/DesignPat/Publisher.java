
import java.util.ArrayList;
import java.util.List;

interface Observer{
    void update(String message);
}

class Subscriber implements Observer{
    private String name;

    Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received: " + message);
    }

}

class Publisher {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void notifyObserver(String message){
        for (var observer : observers)
            observer.update(message);
    }

}


//public class Main {
//    public static void main(String[] args) {
////        StreamsDemo.show();
//        Publisher publisher = new Publisher();
//
//        var user1 = new Subscriber("Alice");
//        var user2 = new Subscriber("Bob");
//
//        publisher.addObserver(user1);
//        publisher.addObserver(user2);
//
//
//        publisher.notifyObserver("It's notified");
//
//    }
//}

