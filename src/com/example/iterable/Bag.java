package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Bag<T> implements Container<T> {

    private List<T> bag;

    public Bag(){
        this.bag = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return bag.size() == 0;
    }

    @Override
    public int size() {
        return bag.size();
    }

    @Override
    public void add(T item) {
        bag.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return this.bag.iterator();
    }
}