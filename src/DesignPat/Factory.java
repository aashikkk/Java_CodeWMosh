import collections.*;
import generics.GenericList;
import generics.Instructor;
import generics.User;
import generics.Utils;
import lambdas.LambdasDemo;
import streams.CreatingStreamsDemo;
import streams.StreamsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


interface Notification {
    void notifyUser();
}

class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("SMS notification");
    }
}

class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Email notification");
    }
}

class NotificationFactory{
    public static Notification createNotification(String type){
        if (type.equalsIgnoreCase("SMS"))
            return new SMSNotification();
        else if (type.equalsIgnoreCase("Email"))
            return new EmailNotification();
        else
            return null;
    }
}


//public class Main {
//    public static void main(String[] args) {
//        Notification notification = NotificationFactory.createNotification("SMS");
//        notification.notifyUser();
//    }
//}

