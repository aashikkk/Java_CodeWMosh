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

// Component Interface
interface Coffee {
    String getDescription();
    double cost();
}

// Concrete Component
class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double cost() {
        return 0.5;
    }
}

// Decorator
class MilkDecorator implements Coffee{
    private Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return coffee.cost() + 1.5;
    }
}

//// Client code
//public class Main {
//    public static void main(String[] args) {
////        StreamsDemo.show();
//        Coffee coffee = new SimpleCoffee();
//        System.out.println(coffee.getDescription() + " | Cost: " + coffee.cost());
//
//        Coffee coffeeWithMilk = new MilkDecorator(coffee);
//        System.out.println(coffeeWithMilk.getDescription() + " | Cost: " + coffeeWithMilk.cost());
//    }
//}

