package com.adeel.Other_Path.Generics;

public class Box<T> {

    T item;

    public void setItem(T item){
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
