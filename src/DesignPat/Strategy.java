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

// Strategy Interface
interface SortingStrategy {
    void sort(int[] numbers);
}


// Concrete Strategy
class QuickSort implements SortingStrategy {

    @Override
    public void sort(int[] numbers) {
        System.out.println("QuickSort Applied");
    }
}

class MergeSort implements SortingStrategy {

    @Override
    public void sort(int[] numbers) {
        System.out.println("MergeSort Applied");
    }
}

// Context class
class Context {

    private SortingStrategy strategy;

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeSort(int[] numbers){
        strategy.sort(numbers);
    }
}

// Client code
//public class Main {
//    public static void main(String[] args) {
////        StreamsDemo.show();
//        Context context = new Context();
//
//        context.setStrategy(new QuickSort());
//        context.executeSort(new int[]{3, 1, 4});
//
//        context.setStrategy(new MergeSort());
//        context.executeSort(new int[]{3, 1, 4});
//    }
//}


