package generics;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item){
        items[count++] = item;
    }

    public T get(int index){
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<T>{
        private GenericList<T> list;
        private int index;

        public ListIterator(GenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return (index < list.count);
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}

/*
* 1. Create private ListIterator class that implements Iterator<T> interface
* 2. Implement hasNext() and next() methods
* 3. We need to pass GenericList<T> list to its constructor
* 4. Now we need to store this to private list in this class
*
* public ListIterator(GenericList<T> list) {
            this.list = list;
            list.items // this is perfectly fine. this is part of the implementation of the outer class. In future, if we change this array to ArrayList, just need to alter the ListIterator class
        }


* 5. private field for index to iterate over the array
* 6. In hasNext() method, check if index is less than count of list
* 7. In next() method, return the item at index and increment the index
* 8. In Iterator method, return new ListIterator(this)
* */